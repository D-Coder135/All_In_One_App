package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class CalculatorMenu extends AppCompatActivity {
    TextView heading;
    Button simpleCalcButton, calcWithTTTButton, backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_menu);
        heading = findViewById(R.id.textView201);
        simpleCalcButton = findViewById(R.id.button163);
        calcWithTTTButton = findViewById(R.id.button164);
        backButton = findViewById(R.id.button165);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(simpleCalcButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(calcWithTTTButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(CalculatorMenu.this, HomePage.class);
            startActivity(intent);
            finish();
        });

        simpleCalcButton.setOnClickListener(v -> {
            Intent intent = new Intent(CalculatorMenu.this, SimpleCalc.class);
            startActivity(intent);
            finish();
        });

        calcWithTTTButton.setOnClickListener(v -> {
            Intent intent = new Intent(CalculatorMenu.this, CalcWithTTT.class);
            startActivity(intent);
            finish();
        });
    }
}