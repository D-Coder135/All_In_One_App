package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class HomePage extends AppCompatActivity {
    TextView heading;
    Button sensorButton, mediaButton, calculationButton, cameraButton, browserButton, quizButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        heading = findViewById(R.id.textView15);
        sensorButton = findViewById(R.id.button80);
        calculationButton = findViewById(R.id.button81);
        browserButton = findViewById(R.id.button82);
        mediaButton = findViewById(R.id.button83);
        cameraButton = findViewById(R.id.button84);
        quizButton = findViewById(R.id.button85);
        backButton = findViewById(R.id.button86);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(sensorButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(calculationButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(cameraButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(mediaButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(browserButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(quizButton);
        YoYo.with(Techniques.FlipInX).duration(2800).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, DatabasePage.class);
            startActivity(intent);
            finish();
        });

        sensorButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, SensorPage.class);
            startActivity(intent);
            finish();
        });

        mediaButton.setOnClickListener(v -> {
            Intent intent = new Intent(HomePage.this, MediaPage.class);
            startActivity(intent);
            finish();
        });

        calculationButton.setOnClickListener(v-> {
            Intent intent = new Intent(HomePage.this, CalculatorMenu.class);
            startActivity(intent);
            finish();
        });

        cameraButton.setOnClickListener(v-> {
            Intent intent = new Intent(HomePage.this, CameraMenu.class);
            startActivity(intent);
            finish();
        });

        browserButton.setOnClickListener(v-> {
            Intent intent = new Intent(HomePage.this, BrowserPage.class);
            startActivity(intent);
            finish();
        });

        quizButton.setOnClickListener(v-> {
            Intent intent = new Intent(HomePage.this, QuizPage.class);
            startActivity(intent);
            finish();
        });
    }
}