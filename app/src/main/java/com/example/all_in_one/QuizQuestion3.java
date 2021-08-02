package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuizQuestion3 extends AppCompatActivity {
    TextView question;
    Button nextButton;
    RadioButton firstOption, secondOption, thirdOption, fourthOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question3);
        question = findViewById(R.id.textView141);
        nextButton = findViewById(R.id.button841);
        firstOption = findViewById(R.id.radioButton7);
        secondOption = findViewById(R.id.radioButton8);
        thirdOption = findViewById(R.id.radioButton9);
        fourthOption = findViewById(R.id.radioButton10);
    }
}