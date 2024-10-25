package com.example.myapplication;

import android.os.Bundle;

import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class EditInstructorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_instructor);

        EditText editText = findViewById(R.id.nomedelete);
        String nome = getIntent().getStringExtra("str");
        editText.setText(nome);
        
    }
}