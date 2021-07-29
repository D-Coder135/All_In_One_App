package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class HomePage extends AppCompatActivity {
    TextView heading;
    Button sensorButton, mediaButton, calculationButton, phoneButton, browserButton, quizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        heading = findViewById(R.id.textView15);
        sensorButton = findViewById(R.id.button80);
        calculationButton = findViewById(R.id.button81);
        browserButton = findViewById(R.id.button82);
        mediaButton = findViewById(R.id.button83);
        phoneButton = findViewById(R.id.button84);
        quizButton = findViewById(R.id.button85);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(sensorButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(calculationButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(phoneButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(mediaButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(browserButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(quizButton);

        sensorButton.setOnClickListener(v -> {

        });
    }
}