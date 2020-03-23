package com.example.time_picker__dialog_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TimePickerDialog timePickerDialog;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = this.<Button>findViewById(R.id.buttonId);
        textView = this.<TextView>findViewById(R.id.timeViewId);
    }
    public void showMessage(View v){

        TimePicker timePicker = new TimePicker(MainActivity.this);
           int CurrentHoure = timePicker.getCurrentHour();
           int CurrentMinute = timePicker.getCurrentMinute();

        timePickerDialog = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker timePicker, int i, int i1) {
                        textView.setText("Select Time : "+i + ":" + i1);
                    }
                },CurrentHoure,CurrentMinute,true);
        timePickerDialog.show();
    }
}
