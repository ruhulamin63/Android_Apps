package com.example.datepickerdialogdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private TextView textView;
    private DatePickerDialog datePickerDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ButtonId);
        textView = findViewById(R.id.textViewId);
    }

    public void showMessage(View v){

        DatePicker datePicker = new DatePicker(this);
            int currentDay = datePicker.getDayOfMonth();
            int currentMonth = (datePicker.getDayOfMonth()) + 1;
            int currentYear = datePicker.getYear();


        datePickerDialog = new DatePickerDialog(this,

                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                            textView.setText(i2 + "/" + (i1+1)  + "/" + i );
                    }
                },currentYear,currentMonth,currentDay);

        datePickerDialog.show();
    }
}