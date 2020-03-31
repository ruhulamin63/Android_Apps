package com.example.customadepterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionDetails extends AppCompatActivity {

     ImageView imageView;
     TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_details);

        imageView = this.<ImageView>findViewById(R.id.locationImageId);
        textView = this.<TextView>findViewById(R.id.locationTextId);

        //got putExtra data
        Intent intent = getIntent();

        int receivedImage = intent.getIntExtra("image", 0);
        String receivedName = intent.getStringExtra("name");

        textView.setText(receivedName);
        imageView.setImageResource(receivedImage);
    }
}

