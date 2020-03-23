package com.example.datepickerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private DatePicker datePicker;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ButtonId);
        datePicker = findViewById(R.id.DatePickerId);
        textView = findViewById(R.id.TextViewId);

        textView.setText(currentDate());
    }

    public void showMessage(View v){
        textView.setText(currentDate());
    }

    String currentDate(){
        StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("CurrentDate : ");
            stringBuilder.append(datePicker.getDayOfMonth() + "/");
            stringBuilder.append((datePicker.getMonth() + 1) + "/");
            stringBuilder.append(datePicker.getYear());

            return stringBuilder.toString();
    }
}
