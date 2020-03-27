package com.example.customadepterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class DescriptionDetails extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

   // private int[] locationImages = {R.drawable.lalbag_kella, R.drawable.tajmahal_icon, R.drawable.space_icon};
   // private String[] locationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description_details);

        imageView = this.<ImageView>findViewById(R.id.locationImageId);
        textView = this.<TextView>findViewById(R.id.locationTextId);


       // locationName = getResources().getStringArray(R.array.country_details_text);

        //got putExtra data
        Intent intent = getIntent();

        int receivedImage = intent.getIntExtra("image",0);
        String receivedName =  intent.getStringExtra("name");

        textView.setText(receivedName);
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
