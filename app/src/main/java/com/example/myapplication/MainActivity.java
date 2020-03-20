package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity<imageView extends View> extends AppCompatActivity {

    private imageView imageView1,imageView2;

        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            imageView1 = this.<imageView> findViewById(R.id.imageView1Id);
            imageView2 = this.<imageView>findViewById(R.id.imageView2Id);
        }
        public void showMessage(View v) {
            if (v.getId() == R.id.imageView1Id) {
                Toast.makeText(MainActivity.this, "Wow pic", Toast.LENGTH_SHORT).show();
            } else if (v.getId() == R.id.imageView2Id) {
                Toast.makeText(MainActivity.this, "Nice pic", Toast.LENGTH_SHORT).show();
            }
        }
    }