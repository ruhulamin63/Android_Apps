package com.example.radiobuttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private TextView resulTtextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.SeekBarId);
        resulTtextView = findViewById(R.id.textViewId);

        resulTtextView.setText("Volume : " + seekBar.getProgress() + "/" + seekBar.getMax());

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                    resulTtextView.setText("Volume : " + i + "/" + seekBar.getMax());
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(MainActivity.this,"onStartTrackingTouch",Toast.LENGTH_SHORT).show();
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                    Toast.makeText(MainActivity.this,"onStopTrackingTouch",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }