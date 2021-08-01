package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CalcWithTTT extends AppCompatActivity {
    EditText firstNumberField, secondNumberField;
    Button add, sub, mul, div, backButton;
    TextView resultView;
    TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_with_ttt);
        firstNumberField = findViewById(R.id.editText102);
        secondNumberField = findViewById(R.id.editText103);
        add = findViewById(R.id.button32);
        sub = findViewById(R.id.button33);
        mul = findViewById(R.id.button34);
        div = findViewById(R.id.button35);
        backButton = findViewById(R.id.button36);
        resultView = findViewById(R.id.textView21);
    }
}