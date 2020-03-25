package com.example.intentmovingactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = this.<Button>findViewById(R.id.buttonId);
    }
    public void onClickFirstActivity(View v){
        Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

            intent.putExtra("tag","I am second activity open here");
            startActivity(intent);
    }
}
