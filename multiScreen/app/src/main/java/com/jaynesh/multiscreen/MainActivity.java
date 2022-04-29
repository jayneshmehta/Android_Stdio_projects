package com.jaynesh.multiscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.jar.Attributes;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    public static final String EXTRA_NAME = "package com.jaynesh.multiscreen.EXTRA.NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnClick(View v){
        Toast.makeText(this ,"You click a button",Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this,MultiScreen2.class);
        editText = findViewById(R.id.Name);
        String Name = editText.getText().toString();
        intent.putExtra(EXTRA_NAME,Name);
        startActivity(intent);
    }
}