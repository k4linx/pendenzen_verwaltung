package com.example.pendenzen_verwaltung;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class CreateNewTodoActivity extends AppCompatActivity {

    RadioGroup rgPriority;

    String TAG = "CreateNewTodoActivity";
    PendingDao mPendingDao;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_todo);
        rgPriority = findViewById(R.id.priorityRadioGroup);
        mPendingDao = AppDatabase.getAppDb(getApplicationContext()).getPendingDao();
    }


    public void saveNewTodo(View v){



        int selectedRadioButtonID = rgPriority.getCheckedRadioButtonId();
        int prioValue = 0;
        switch (selectedRadioButtonID) {
            case R.id.lowPriorityRadioButton:
                prioValue = 0;
            case R.id.mediumPriorityRadioButton:
                prioValue = 1;
            case R.id.highPriorityRadioButton:
                prioValue = 2;
            default:
                prioValue = 0;
        }

        List<Pending> todoToSave = new ArrayList<>();
        Pending pending = new Pending();
        EditText title = findViewById(R.id.titleInput);
        EditText description = findViewById(R.id.descriptionInput);
        EditText date = findViewById(R.id.dateInput);

        String titleText = title.getText().toString();
        String descriptionText = description.getText().toString();
        String dateText = date.getText().toString();
        //Log.d(TAG, "title: :" + title.getText() + ":");
        if(titleText.matches("") || descriptionText.matches("") || dateText.matches("")){
            Toast.makeText(CreateNewTodoActivity.this, "Please fill out all fields", Toast.LENGTH_LONG).show();
        }else{
            pending.setPendingTitle(titleText);
            pending.setPendingDescription(descriptionText);
            pending.setPendingDate(dateText);
            pending.setPendingImportance(prioValue);

            todoToSave.add(pending);

            mPendingDao.insertAll(todoToSave);

            title.setText("");
            description.setText("");
            date.setText("");

            startActivity(new Intent(CreateNewTodoActivity.this, MainActivity.class));

        }
    }
}