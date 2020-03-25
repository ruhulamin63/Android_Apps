package com.example.videoviewdemocontroler;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = this.<VideoView>findViewById(R.id.VideoViewId);

        Uri uri = Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.demo_video);
            videoView.setVideoURI(uri);

        MediaController mediaController = new MediaController(MainActivity.this);
            videoView.setMediaController(mediaController);
            videoView.start();
    }
}
