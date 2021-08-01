package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;
import android.widget.ImageView;

public class Camera extends AppCompatActivity {
    ImageView imageView;
    Button cameraButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        imageView = findViewById(R.id.imageView);
        cameraButton = findViewById(R.id.button600);
        backButton = findViewById(R.id.button601);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(Camera.this, CameraMenu.class);
            startActivity(intent);
            finish();
        });

        cameraButton.setOnClickListener(v -> {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        });
    }
}