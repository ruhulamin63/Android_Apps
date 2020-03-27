package com.example.fruitsitemdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdateActivity extends AppCompatActivity {

    private TextView listdata;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdate);

        listdata = findViewById(R.id.listdata);
        imageView = findViewById(R.id.imageView);

        Intent intent = getIntent();
        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
        listdata.setText(receivedName);
        imageView.setImageResource(receivedImage);

        //enable back Button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    //getting back to listView
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
