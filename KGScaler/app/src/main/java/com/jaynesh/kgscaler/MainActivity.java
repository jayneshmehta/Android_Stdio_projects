package com.jaynesh.kgscaler;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
  private Button button;
  private TextView textView;
  private EditText editText;
    private EditText editText2;
    public void onClick(View view){

        button = findViewById(R.id.button);
        textView = findViewById(R.id.textView4);
        editText = findViewById(R.id.editTextNumber);
        editText2 = findViewById(R.id.editTextNumber2);

        String num1 = editText.getText().toString();
        double Num1 = Integer.parseInt(num1);
        String num2 = editText2.getText().toString();
        double Num2 = Integer.parseInt(num2);
        double ans = Num1 + Num2;

        textView.setText("The Added Value is " + ans);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}