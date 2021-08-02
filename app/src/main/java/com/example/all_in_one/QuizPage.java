package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class QuizPage extends AppCompatActivity {
    Button startButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_page);
        startButton = findViewById(R.id.button850);
        backButton = findViewById(R.id.button851);

        YoYo.with(Techniques.FlipInX).duration(2800).repeat(0).playOn(startButton);
        YoYo.with(Techniques.FlipInX).duration(2800).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(QuizPage.this, HomePage.class);
            startActivity(intent);
            finish();
        });

        startButton.setOnClickListener(v -> {
            Intent intent = new Intent(QuizPage.this, QuizQuestion1.class);
            startActivity(intent);
            finish();
        });
    }
}