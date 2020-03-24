package com.example.zoomin_zoomout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.ZoomControls;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private ZoomControls zoomControls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = this.<ImageView>findViewById(R.id.ImageId);
        zoomControls = this.<ZoomControls>findViewById(R.id.ZoomId);

        zoomControls.setOnZoomInClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                Toast.makeText(MainActivity.this,"Zoom In",Toast.LENGTH_SHORT).show();

                imageView.setScaleX((float) x + 1);
                imageView.setScaleY((float) y + 1);
            }
        });

        zoomControls.setOnZoomOutClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float x = imageView.getScaleX();
                float y = imageView.getScaleY();

                if(x>1 && y>1) {

                    Toast.makeText(MainActivity.this,"Zoom Out",Toast.LENGTH_SHORT).show();

                    imageView.setScaleX((float) x - 1);
                    imageView.setScaleY((float) y - 1);
                }
            }
        });
    }
}
