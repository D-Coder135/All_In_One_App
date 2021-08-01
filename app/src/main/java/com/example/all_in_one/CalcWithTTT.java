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
    }
}