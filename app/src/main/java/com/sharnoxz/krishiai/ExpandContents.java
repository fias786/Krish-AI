package com.sharnoxz.krishiai;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.sharnoxz.krishiai.adapter.HorizontalRecyclerViewAdapter;
import com.sharnoxz.krishiai.data.HData;

import java.util.ArrayList;

public class ExpandContents extends AppCompatActivity{

    RecyclerView recyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expand_contents);
        recyclerView = findViewById(R.id.AllContentsExpandRecyclerView);
        Intent intent = getIntent();
        ArrayList<HData> data = (ArrayList<HData>) intent.getExtras().get("data");
        recyclerView.setLayoutManager(new GridLayoutManager(this,2));
        recyclerView.setAdapter(new HorizontalRecyclerViewAdapter(this,data));
        recyclerView.setHasFixedSize(true);
    }
}
