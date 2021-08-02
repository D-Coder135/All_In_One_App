package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizQuestion1 extends AppCompatActivity {
    TextView question;
    Button nextButton;
    RadioButton firstOption, secondOption;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question1);
        nextButton = findViewById(R.id.button830);
        firstOption = findViewById(R.id.radioButton);
        secondOption = findViewById(R.id.radioButton2);
    }
}