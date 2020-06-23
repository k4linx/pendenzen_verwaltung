package com.example.pendenzen_verwaltung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class CreateNewTodoActivity extends AppCompatActivity {

    RadioGroup rgPriority;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_todo);
        rgPriority = findViewById(R.id.priorityRadioGroup);
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
        }

        List<Pending> todoToSave = new ArrayList<>();
        Pending pending = new Pending();
        EditText title = findViewById(R.id.titleInput);
        pending.setPendingTitle(title.getText().toString());
        EditText date = findViewById(R.id.dateInput);
        pending.setPendingTitle(date.getText().toString());


    }
}