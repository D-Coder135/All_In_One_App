package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MP4Player extends AppCompatActivity {
    Button playButton, stopButton, backButton;
    VideoView videoView;
    MediaController mediaController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp4_player);
        playButton = findViewById(R.id.button150);
        stopButton = findViewById(R.id.button151);
        backButton = findViewById(R.id.button152);
        videoView = findViewById(R.id.videoView);
        mediaController = new MediaController(this);

        playButton.setOnClickListener(v -> {
            videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.hall_of_fame);
            videoView.setMediaController(mediaController);
            mediaController.setAnchorView(videoView);
            videoView.start();
        });

        stopButton.setOnClickListener(v -> videoView.stopPlayback());

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(MP4Player.this, MediaPage.class);
            startActivity(intent);
            finish();
        });
    }
}