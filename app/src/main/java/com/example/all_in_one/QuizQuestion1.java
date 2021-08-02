package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import org.w3c.dom.Text;

public class QuizQuestion1 extends AppCompatActivity {
    TextView question;
    Button nextButton;
    RadioButton firstOption, secondOption;
    static int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_question1);
        question = findViewById(R.id.textView121);
        nextButton = findViewById(R.id.button830);
        firstOption = findViewById(R.id.radioButton);
        secondOption = findViewById(R.id.radioButton2);

        YoYo.with(Techniques.RollIn).duration(1500).repeat(0).playOn(question);
        YoYo.with(Techniques.FlipInX).duration(2500).repeat(0).playOn(nextButton);

        nextButton.setOnClickListener(v -> {
            score = 0;
            if (firstOption.isChecked()) {
                ++score;
            } else {
                --score;
            }
            Intent intent = new Intent(QuizQuestion1.this, QuizQuestion2.class);
            startActivity(intent);
            finish();
        });
    }
}