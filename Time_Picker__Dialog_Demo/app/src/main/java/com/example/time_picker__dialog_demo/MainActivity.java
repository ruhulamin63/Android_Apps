package com.example.time_picker__dialog_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TimePicker timePicker;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = this.<Button>findViewById(R.id.buttonId);
        timePicker = this.<TimePicker>findViewById(R.id.timePickerId);
        textView = this.<TextView>findViewById(R.id.timeViewId);

        timePicker.setIs24HourView(true);
    }
    public void showMessage(View v){

        String time = timePicker.getCurrentHour() + ":" + timePicker.getCurrentMinute();

        textView.setText("Selected Time : " + time);
       // textView.setText(time);
    }
}
