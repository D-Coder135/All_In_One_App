package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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

    }
}