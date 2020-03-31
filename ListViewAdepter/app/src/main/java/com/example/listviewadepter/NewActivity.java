package com.example.listviewadepter;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NewActivity extends AppCompatActivity {

    ImageView imageView;
    TextView mDetailTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        //Create actionBar
        ActionBar actionBar = getSupportActionBar();

         imageView = this.<ImageView>findViewById(R.id.locationImageId);
         mDetailTv = this.<TextView>findViewById(R.id.locationTextId);

        //get data from previous activity when item of listView is clicked using intent
        Intent intent = getIntent();
        String mActionBarTitle = intent.getStringExtra("actionBarTitle");
        int mActionBarIcon = intent.getIntExtra("actionBarIcon",0);
        String mContent = intent.getStringExtra("contentTv");

        //set actionbar title
            actionBar.setTitle(mActionBarTitle);
        //set text in textView
            mDetailTv.setText(mContent);

    }
}
