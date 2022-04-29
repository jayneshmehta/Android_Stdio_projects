package com.jaynesh.listviewapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends ArrayAdapter <String> {
private String arr[];
private Context context;

    public MyAdapter(@NonNull Context context, int resource, @NonNull String[] arr) {
        super(context, resource, arr);
        this.arr = arr;
        this.context = context;
    }
    @Nullable
    @Override
    public String getItem(int position ) {

        return arr[position];

    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.my_layout,parent,false);
        TextView textview = convertView.findViewById(R.id.textView2);
        textview.setText(getItem(position));
        TextView textview2 = convertView.findViewById(R.id.textView3);
        textview2.setText(getItem(position));
        convertView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, "You have clicked : " + position, Toast.LENGTH_SHORT).show();
            }
        });
        return convertView;
    }
}