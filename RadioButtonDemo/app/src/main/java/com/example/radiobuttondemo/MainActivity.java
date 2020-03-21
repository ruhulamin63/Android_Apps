package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private RadioGroup radioGroup;
    private RadioButton genderButton;
    private TextView resulTtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.ButtonId);
        radioGroup = findViewById(R.id.radioGroupId);
        resulTtextView = findViewById(R.id.textViewId);

    }
    public void showMessage(View v){
       int selectedId = radioGroup.getCheckedRadioButtonId();

        genderButton = findViewById(selectedId);
        String value = genderButton.getText().toString();
            resulTtextView.setText("You have selected : "+value);
    }

}
