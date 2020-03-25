package com.example.intentmovingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = this.<TextView>findViewById(R.id.TextViedId);

        Bundle bundle = getIntent().getExtras();

            if(bundle != null){
                String value = bundle.getString("tag");
                textView.setText(value);
            }
    }
}
