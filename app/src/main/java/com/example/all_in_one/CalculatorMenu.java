package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorMenu extends AppCompatActivity {
    TextView heading;
    Button simpleCalcButton, calcWithTTTButton, backButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_menu);
        heading = findViewById(R.id.textView201);
        simpleCalcButton = findViewById(R.id.button163);
    }
}