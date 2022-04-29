package com.jaynesh.quizy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button tr;
    Button fl;

     private   String[] Question = {"Java Is  Person? ", "Java Was Introduced in 1919? ","Java ia OOP Lang ?","Java is A secure ?",
            "Java was build by netscape?","Java is a programming Language ?"  };

    private Boolean Answer[] ={false,false,true,true,false,true};
    private int score = 0;
    private int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    tr = findViewById(R.id.Yes);
    fl = findViewById(R.id.No);
    editText = findViewById(R.id.editText);
    editText.setText(Question[index]);


        tr.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
        if(index <= Question.length-1){
            if(Answer[index] == true){
                score++;
            }
            index++;
            if(index <= Question.length-1) {
                editText.setText(Question[index]);
            }
            else {
                Toast.makeText(MainActivity.this, "Score : "+score, Toast.LENGTH_SHORT).show();
            }
        }else{
                Toast.makeText(MainActivity.this, "Restart the application", Toast.LENGTH_SHORT).show();
            }
        }
    });
        fl.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
       if(index<= Question.length-1) {
           if (Answer[index] == false) {
               score++;
           }
           index++;
           if (index  <= Question.length-1) {
               editText.setText(Question[index]);
           } else {
               Toast.makeText(MainActivity.this, "Score : " + score, Toast.LENGTH_SHORT).show();
           }
       }
       else{
           Toast.makeText(MainActivity.this, "Restart the application", Toast.LENGTH_SHORT).show();
       }
        }
    });
    }
}