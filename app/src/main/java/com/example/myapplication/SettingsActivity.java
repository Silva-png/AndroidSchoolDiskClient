package com.example.myapplication;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        NumberPicker np = findViewById(R.id.picker);
        np.setMinValue(0);
        np.setMaxValue(255);
        np.setWrapSelectorWheel(true);

        NumberPicker np1 = findViewById(R.id.picker1);
        np1.setMinValue(0);
        np1.setMaxValue(255);
        np1.setWrapSelectorWheel(true);

        NumberPicker np2 = findViewById(R.id.picker2);
        np2.setMinValue(0);
        np2.setMaxValue(255);
        np2.setWrapSelectorWheel(true);

        NumberPicker np3 = findViewById(R.id.picker3);
        np3.setMinValue(0);
        np3.setMaxValue(255);
        np3.setWrapSelectorWheel(true);

        Button buttonset = findViewById(R.id.buttonset);
        buttonset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ip = np.getValue() + "." + np1.getValue() + "." + np2.getValue() + "." + np3.getValue();
                Toast.makeText(getApplicationContext(), ip, Toast.LENGTH_SHORT).show();
            }
        });
    }



}