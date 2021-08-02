package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizQuestion2 extends AppCompatActivity {
    TextView question;
    Button nextButton;
    RadioButton firstOption, secondOption, thirdOption, fourthOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question2);
        question = findViewById(R.id.textView131);
        nextButton = findViewById(R.id.button831);
        firstOption = findViewById(R.id.radioButton3);
        secondOption = findViewById(R.id.radioButton4);
        thirdOption = findViewById(R.id.radioButton5);
        fourthOption = findViewById(R.id.radioButton6);

        nextButton.setOnClickListener(v -> {
            if (fourthOption.isChecked()) {
                ++QuizQuestion1.score;
            } else {
                --QuizQuestion1.score;
            }
            Intent intent = new Intent(QuizQuestion2.this, QuizQuestion3.class);
            startActivity(intent);
            finish();
        });
    }
}