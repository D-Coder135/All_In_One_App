package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class QuizResultPage extends AppCompatActivity {
    TextView resultView;
    Button startOver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result_page);
        resultView = findViewById(R.id.textView151);
        startOver = findViewById(R.id.button851);

        resultView.setText("Your Final Score Is = " +QuizQuestion1.score);

        startOver.setOnClickListener(v -> {
            Intent intent = new Intent(QuizResultPage.this, QuizPage.class);
            startActivity(intent);
            finish();
        });
    }
}