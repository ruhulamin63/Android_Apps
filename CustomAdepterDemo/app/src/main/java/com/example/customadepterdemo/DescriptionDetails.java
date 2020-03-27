package com.example.customadepterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionDetails extends AppCompatActivity {

    private TextView textView;
    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_details);

        textView = this.<TextView>findViewById(R.id.textId);
        imageView = this.<ImageView>findViewById(R.id.imageId);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        // String receivedNameDetails =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        textView.setText(receivedName);
       // textView.setText(receivedNameDetails);
        imageView.setImageResource(receivedImage);
    }
}
