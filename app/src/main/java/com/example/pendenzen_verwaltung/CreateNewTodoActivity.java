package com.example.pendenzen_verwaltung;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;

import java.util.ArrayList;
import java.util.List;

public class CreateNewTodoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_new_todo);
    }


    public void saveNewTodo(View v){
        List<Pending> todoToSave = new ArrayList<>();
        Pending pending = new Pending();
        EditText title = findViewById(R.id.titleInput);
        pending.setPendingTitle(title.getText().toString());
        EditText date = findViewById(R.id.dateInput);
        pending.setPendingTitle(date.getText().toString());


    }
}