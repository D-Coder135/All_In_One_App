package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.widget.Button;

public class MP3Player extends AppCompatActivity {
    Button playButton, pauseButton, stopButton, backButton;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mp3_player);
        playButton = findViewById(R.id.button140);
        pauseButton = findViewById(R.id.button141);
        stopButton = findViewById(R.id.button142);
        backButton = findViewById(R.id.button143);
        mediaPlayer = MediaPlayer.create(this, R.raw.believer);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(MP3Player.this, MediaPage.class);
            startActivity(intent);
            finish();
        });

        playButton.setOnClickListener(v -> mediaPlayer.start());

        pauseButton.setOnClickListener(v -> mediaPlayer.pause());

        stopButton.setOnClickListener(v -> mediaPlayer.stop());
    }
}