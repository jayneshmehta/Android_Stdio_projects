package com.jaynesh.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String [] arr = {"Item-1","Item-2","Item-3","Item-4","Item-5","Item-6","Last Item"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.listview);
        //Builtin Adadpter:
//      ArrayAdapter ad = new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,arr);
//      listView.setAdapter(ad);
     // custom Adapter
        MyAdapter ad = new MyAdapter(this,R.layout.my_layout,arr);
        listView.setAdapter(ad);

    }
}