package com.example.pendenzen_verwaltung;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListAdapter listAdapter;

    PendingDao mPendingDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPendingDao = AppDatabase.getAppDb(getApplicationContext()).getPendingDao();
        List<Pending> pendingsFromDatabase = mPendingDao.getAll();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        listAdapter = new ListAdapter(pendingsFromDatabase);
        recyclerView.setAdapter(listAdapter);
    }

    public void onClick(View v) {
        startActivity(new Intent(MainActivity.this, CreateNewTodoActivity.class));
    }
}