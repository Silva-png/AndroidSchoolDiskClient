package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import android.view.*;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;

public class IntructorActivity extends AppCompatActivity {

    private ListView listView;
    private ArrayList<String> list;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intructor);

        listView = (ListView) findViewById(R.id.listView);

        list = new ArrayList<String>();
        String[] students = getResources().getStringArray(R.array.instructors);
        Collections.addAll(list, students);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        registerForContextMenu(listView);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = (MenuInflater) getMenuInflater();
        inflater.inflate(R.menu.menuinstructor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.add){
                Toast.makeText(IntructorActivity.this,
                        "Add option selected", Toast.LENGTH_SHORT).show();
                return true;
        }
        if (item.getItemId() == R.id.Reload){
            Toast.makeText(IntructorActivity.this,
                    "Reload option selected", Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId() == R.id.Settings1){
            Toast.makeText(IntructorActivity.this,
                    "Settings option selected", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(IntructorActivity.this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }
    return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater inflater = (MenuInflater) getMenuInflater();
        inflater.inflate(R.menu.contextmenu_instructor, menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo info = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        int pos = info.position;
        long id = info.id;
        String str = (String) adapter.getItem(pos);
        if (item.getItemId() == R.id.delete){
            Toast.makeText(getApplicationContext(),
                    "Delete option selected:" + str,
                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(IntructorActivity.this, DeleteIntructorActivity.class);
            intent.putExtra("str", str);
            startActivity(intent);
            return true;
        }
        if (item.getItemId() == R.id.editdata){
            Toast.makeText(getApplicationContext(),
                    "Edit data option selected: " + str,
                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(IntructorActivity.this, EditInstructorActivity.class);
            intent.putExtra("str", str);
            startActivity(intent);
            return true;
        }
        if (item.getItemId() == R.id.editdetails){
            Toast.makeText(getApplicationContext(),
                    "Delete option selected:" + str,
                    Toast.LENGTH_LONG).show();
            Intent intent = new Intent(IntructorActivity.this, EditInstructorActivity.class);
            intent.putExtra("str", str);
            startActivity(intent);
            return true;
        }
        return super.onContextItemSelected(item);
    }

}
