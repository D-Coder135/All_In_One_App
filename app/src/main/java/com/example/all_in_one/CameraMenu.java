package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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
    }
}