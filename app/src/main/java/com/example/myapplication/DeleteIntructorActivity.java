package com.example.myapplication;

import android.os.Bundle;

import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DeleteIntructorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_intructor);

        EditText editText = findViewById(R.id.nomedelete);
        String nome = getIntent().getStringExtra("str");
        editText.setText(nome);

    }
}