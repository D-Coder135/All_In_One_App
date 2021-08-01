package com.example.all_in_one;

import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class VideoCamera extends AppCompatActivity {
    VideoView videoView;
    Button cameraButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_camera);
        videoView = findViewById(R.id.videoView2);
    }
}