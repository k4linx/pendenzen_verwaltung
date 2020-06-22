package com.example.pendenzen_verwaltung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private HashMap<Integer, String> mDataset = new HashMap<>();
    private ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataset.put(0, "JJ 0");
        mDataset.put(1, "JJ 1");
        mDataset.put(2, "JJ 2");
        mDataset.put(3, "JJ 3");
        mDataset.put(4, "JJ 4");
        mDataset.put(5, "JJ 5");
        mDataset.put(6, "JJ 6");
        mDataset.put(7, "JJ 7");
        mDataset.put(8, "JJ 8");
        mDataset.put(9, "JJ 9");
        mDataset.put(10, "JJ 10");
        mDataset.put(11, "JJ 11");
        mDataset.put(12, "JJ 12");

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new ListAdapter(mDataset);
        recyclerView.setAdapter(listAdapter);
    }

    public void onClick(View v){
        startActivity(new Intent(MainActivity.this, CreateNewTodoActivity.class));
    }}