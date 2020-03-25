package com.example.countryprofileproject;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileCountry extends AppCompatActivity {

    private ImageView imageView;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_country);

        imageView = this.<ImageView>findViewById(R.id.imageId);
        textView = this.<TextView>findViewById(R.id.textId);

        Bundle bundle = getIntent().getExtras();

        if(bundle != null){
            String countryName = bundle.getString("name");
            showDetails(countryName);
        }
    }
    public void showDetails(String s){
        if(s.equals("bangladesh")){
            imageView.setImageResource(R.drawable.lalbag_kella);
            textView.setText(R.string.lalbagh_kella_text);
        }
        else if(s.equals("india")){
            imageView.setImageResource(R.drawable.tajmahal_icon);
             textView.setText(R.string.tajmahal_text);
        }
        else if(s.equals("usa")){
            imageView.setImageResource(R.drawable.space_icon);
            textView.setText(R.string.nasa_space_details);
        }
    }
}
