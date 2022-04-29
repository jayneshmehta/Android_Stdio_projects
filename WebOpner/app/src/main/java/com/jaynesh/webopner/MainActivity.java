package com.jaynesh.webopner;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button);
        editText = findViewById(R.id.editText);

  button.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          String Address = editText.getText().toString();
          Uri webpage = Uri.parse(Address);
          Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
          intent.putExtra(SearchManager.QUERY, Address);
          if (intent.resolveActivity(getPackageManager()) != null) {
              startActivity(intent);
              Toast.makeText(MainActivity.this, Address, Toast.LENGTH_SHORT).show();
          }else {
              Toast.makeText(MainActivity.this, "Not resolve", Toast.LENGTH_SHORT).show();
          }
      }
  });
}
}