package com.example.time_picker__dialog_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AnalogClock analogClock;
    private TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.AnalogId);
        textClock = findViewById(R.id.TextClockId);
    }
    public void showMessage(View v){
        if(v.getId() == R.id.AnalogId){
            Toast.makeText(MainActivity.this,"Analog Colock",Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.TextClockId){
            Toast.makeText(MainActivity.this,"Text Colock",Toast.LENGTH_SHORT).show();
        }
    }
}
