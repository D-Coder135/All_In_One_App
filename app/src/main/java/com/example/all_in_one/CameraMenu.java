package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class CameraMenu extends AppCompatActivity {
    TextView heading;
    Button imageCaptureButton, videoRecorderButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_menu);
        heading = findViewById(R.id.textView21);
        imageCaptureButton = findViewById(R.id.button800);
        videoRecorderButton = findViewById(R.id.button801);
        backButton = findViewById(R.id.button802);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2200).repeat(0).playOn(imageCaptureButton);
        YoYo.with(Techniques.FlipInY).duration(2200).repeat(0).playOn(videoRecorderButton);
        YoYo.with(Techniques.FlipInY).duration(2200).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(CameraMenu.this, HomePage.class);
            startActivity(intent);
            finish();
        });

        imageCaptureButton.setOnClickListener(v -> {
            Intent intent = new Intent(CameraMenu.this, Camera.class);
            startActivity(intent);
            finish();
        });

        videoRecorderButton.setOnClickListener(v -> {
            Intent intent = new Intent(CameraMenu.this, VideoCamera.class);
            startActivity(intent);
            finish();
        });
    }
}