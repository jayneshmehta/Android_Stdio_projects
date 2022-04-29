package com.jaynesh.setalarm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TimePicker tp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnToggleClicked(View view) {

        tp = findViewById(R.id.timePicker);

        public void createAlarm() {

            Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                    .putExtra(AlarmClock.EXTRA_MESSAGE, "hi")
                    .putExtra(AlarmClock.EXTRA_HOUR, 12)
                    .putExtra(AlarmClock.EXTRA_MINUTES, 40);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }
        }


    }
}