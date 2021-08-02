package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

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

        YoYo.with(Techniques.RollIn).duration(1500).repeat(0).playOn(question);
        YoYo.with(Techniques.FlipInX).duration(2500).repeat(0).playOn(nextButton);

        nextButton.setOnClickListener(v -> {
            if (thirdOption.isChecked()) {
                ++QuizQuestion1.score;
            } else {
                --QuizQuestion1.score;
            }
            Intent intent = new Intent(QuizQuestion3.this, QuizResultPage.class);
            startActivity(intent);
            finish();
        });
    }
}