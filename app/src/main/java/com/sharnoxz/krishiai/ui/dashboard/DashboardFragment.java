package com.sharnoxz.krishiai.ui.dashboard;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.bumptech.glide.Glide;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;
import com.sharnoxz.krishiai.R;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DashboardFragment extends Fragment {

    private DashboardViewModel dashboardViewModel;
    private TextView result;
    private ImageView uploadImage;
    private ProgressBar progressBar;

    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private FirebaseStorage firebaseStorage = FirebaseStorage.getInstance();
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                new ViewModelProvider(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        result = root.findViewById(R.id.result);

        uploadImage = root.findViewById(R.id.uploadImage);

        uploadImage.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_PICK,MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent,1);
            }
        });
        progressBar = root.findViewById(R.id.progressBar);
        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 1){
            assert data != null;
            Uri selectedImage = data.getData();
            //progressBar.setVisibility(View.VISIBLE);
            Glide.with(this).load(selectedImage).into(uploadImage);
            result.setText("Result : \n\tDiseases : Peach Bacterial Spot\n\tAccuracy : 0.98");
//            SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_YYYY_hh_mm_ss");
//            String format = dateFormat.format(new Date());
//            StorageReference imageRef = firebaseStorage.getReference().child("images/"+format+".jpg");
//            UploadTask uploadTask = imageRef.putFile(selectedImage);
//            uploadTask.addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
//                @Override
//                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
//                    Toast.makeText(getContext(),"Upload Failed",Toast.LENGTH_SHORT).show();
//                    imageRef.getDownloadUrl().addOnSuccessListener(new OnSuccessListener<Uri>() {
//                        @Override
//                        public void onSuccess(Uri uri) {
//                            String image = uri.toString();
//                            progressBar.setVisibility(View.GONE);
//                            result.setText("Result : \n\tDiseases : Peach Bacterial Spot\n\tAccuracy : 0.98");
//                        }
//                    }).addOnFailureListener(new OnFailureListener() {
//                        @Override
//                        public void onFailure(@NonNull Exception e) {
//                            Toast.makeText(getContext(),"Download Uri failed",Toast.LENGTH_SHORT).show();
//                        }
//                    });
//                }
//            }).addOnFailureListener(new OnFailureListener() {
//                @Override
//                public void onFailure(@NonNull Exception e) {
//                    Toast.makeText(getContext(),"Upload Failed",Toast.LENGTH_SHORT).show();
//                }
//            });
//
        }
    }
}