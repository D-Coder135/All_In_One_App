package com.example.all_in_one;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoCamera extends AppCompatActivity {
    VideoView videoView;
    Button videoButton, backButton;
    MediaController mediaController;
    Uri uri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_camera);
        videoView = findViewById(R.id.videoView2);
        videoButton = findViewById(R.id.button602);
        backButton = findViewById(R.id.button603);
        mediaController = new MediaController(this);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(VideoCamera.this, CameraMenu.class);
            startActivity(intent);
            finish();
        });

        videoButton.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
            startActivityForResult(intent, 100);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        uri = data.getData();

        videoView.setVideoURI(uri);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();
    }
}