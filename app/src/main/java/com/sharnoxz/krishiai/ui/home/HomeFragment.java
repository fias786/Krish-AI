package com.sharnoxz.krishiai.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sharnoxz.krishiai.R;
import com.sharnoxz.krishiai.adapter.VerticalRecyclerViewAdapter;
import com.sharnoxz.krishiai.data.VData;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private RecyclerView recyclerView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = root.findViewById(R.id.verticalRecyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(root.getContext(), LinearLayoutManager.VERTICAL, false));
        recyclerView.setHasFixedSize(true);
        homeViewModel.getData().observe(getViewLifecycleOwner(), new Observer<ArrayList<VData>>() {
            @Override
            public void onChanged(ArrayList<VData> vData) {
                recyclerView.setAdapter(new VerticalRecyclerViewAdapter(root.getContext(),vData));
            }
        });
        return root;
    }
}