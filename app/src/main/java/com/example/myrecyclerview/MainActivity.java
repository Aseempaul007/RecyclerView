package com.example.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.myrecyclerview.adapters.ModelAdapter;
import com.example.myrecyclerview.modelClass.ModelClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView ;
    ArrayList<ModelClass> arr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        arr = new ArrayList<>();

        arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));
        arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));arr.add(new ModelClass(R.drawable.mypic,"Kutti"));
        arr.add(new ModelClass(R.drawable.pic,"Diduu"));

        ModelAdapter modelAdapter = new ModelAdapter(arr,this);
        recyclerView.setAdapter(modelAdapter);

//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,true);
//        recyclerView.setLayoutManager(linearLayoutManager);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,10);
        recyclerView.setLayoutManager(gridLayoutManager);

    }
}