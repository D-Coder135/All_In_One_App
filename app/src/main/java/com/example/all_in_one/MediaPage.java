package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MediaPage extends AppCompatActivity {
    TextView heading;
    Button mp3PlayerButton, mp4PlayerButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_page);
        heading = findViewById(R.id.textView100);
        mp3PlayerButton = findViewById(R.id.button101);
        mp4PlayerButton = findViewById(R.id.button102);
        backButton = findViewById(R.id.button103);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(mp3PlayerButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(mp4PlayerButton);
        YoYo.with(Techniques.FlipInY).duration(3500).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(MediaPage.this, HomePage.class);
            startActivity(intent);
            finish();
        });

        mp3PlayerButton.setOnClickListener(v -> {
            Intent intent = new Intent(MediaPage.this, MP3Player.class);
            startActivity(intent);
            finish();
        });

        mp4PlayerButton.setOnClickListener(v -> {
            Intent intent = new Intent(MediaPage.this, MP4Player.class);
            startActivity(intent);
            finish();
        });
    }
}