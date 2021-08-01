package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.Locale;

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
        add = findViewById(R.id.button800);
        sub = findViewById(R.id.button801);
        mul = findViewById(R.id.button802);
        div = findViewById(R.id.button803);
        backButton = findViewById(R.id.button804);
        resultView = findViewById(R.id.textView411);

        textToSpeech = new TextToSpeech(this, status -> {
            textToSpeech.setLanguage(Locale.ENGLISH);
            textToSpeech.setSpeechRate(0.5f);
        });

        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(firstNumberField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(secondNumberField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(add);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(sub);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(mul);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(div);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(CalcWithTTT.this, CalculatorMenu.class);
            startActivity(intent);
            finish();
        });

        add.setOnClickListener(v -> {
            String firstNumber = firstNumberField.getText().toString();
            String secondNumber = secondNumberField.getText().toString();
            Float firsNumberInFloat = Float.parseFloat(firstNumber);
            Float secondNumberInFloat = Float.parseFloat(secondNumber);
            float resultInFloat = firsNumberInFloat + secondNumberInFloat;
            String resultInString = Float.toString(resultInFloat);
            resultView.setText("Final Result = " +resultInString);
            textToSpeech.speak(resultInString, TextToSpeech.QUEUE_FLUSH, null);
            Toast.makeText(CalcWithTTT.this, "The result is = " + resultInString, Toast.LENGTH_SHORT).show();
        });

        sub.setOnClickListener(v -> {
            String firstNumber = firstNumberField.getText().toString();
            String secondNumber = secondNumberField.getText().toString();
            Float firsNumberInFloat = Float.parseFloat(firstNumber);
            Float secondNumberInFloat = Float.parseFloat(secondNumber);
            float resultInFloat = firsNumberInFloat - secondNumberInFloat;
            String resultInString = Float.toString(resultInFloat);
            resultView.setText("Final Result = " +resultInString);
            textToSpeech.speak(resultInString, TextToSpeech.QUEUE_FLUSH, null);
            Toast.makeText(CalcWithTTT.this, "The result is = " + resultInString, Toast.LENGTH_SHORT).show();
        });

        mul.setOnClickListener(v -> {
            String firstNumber = firstNumberField.getText().toString();
            String secondNumber = secondNumberField.getText().toString();
            Float firsNumberInFloat = Float.parseFloat(firstNumber);
            Float secondNumberInFloat = Float.parseFloat(secondNumber);
            float resultInFloat = firsNumberInFloat * secondNumberInFloat;
            String resultInString = Float.toString(resultInFloat);
            resultView.setText("Final Result = " +resultInString);
            textToSpeech.speak(resultInString, TextToSpeech.QUEUE_FLUSH, null);
            Toast.makeText(CalcWithTTT.this, "The result is = " + resultInString, Toast.LENGTH_SHORT).show();
        });

        div.setOnClickListener(v -> {
            String firstNumber = firstNumberField.getText().toString();
            String secondNumber = secondNumberField.getText().toString();
            Float firsNumberInFloat = Float.parseFloat(firstNumber);
            Float secondNumberInFloat = Float.parseFloat(secondNumber);
            float resultInFloat = firsNumberInFloat / secondNumberInFloat;
            String resultInString = Float.toString(resultInFloat);
            resultView.setText("Final Result = " +resultInString);
            textToSpeech.speak(resultInString, TextToSpeech.QUEUE_FLUSH, null);
            Toast.makeText(CalcWithTTT.this, "The result is = " + resultInString, Toast.LENGTH_SHORT).show();
        });
    }
}