package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

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
    }
}