package com.example.customadepterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class CountryDetails extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        imageView = this.<ImageView>findViewById(R.id.imageId);
        textView = this.<TextView>findViewById(R.id.textId);


        Intent intent = getIntent();

            imageView.setImageResource(intent.getIntExtra("imageView",0));
            textView.setText(intent.getStringExtra("name"));
    }
}
