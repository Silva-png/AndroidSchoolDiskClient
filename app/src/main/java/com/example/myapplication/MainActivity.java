package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), IntructorActivity.class);
                startActivity(i);
            }
        });

        };
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = (MenuInflater) getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
    return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.Reload){
            Toast.makeText(getApplicationContext(),
                    "Reload option selected",Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == R.id.Settings){
            Toast.makeText(getApplicationContext(),
                    "Settings option selected",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, SettingsActivity.class);
            startActivity(i);
            return true;
        }
        else{
            return super.onOptionsItemSelected(item);
        }
    }
}
