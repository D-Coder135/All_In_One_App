package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class SensorPage extends AppCompatActivity {
    TextView heading;
    Button proximityButton, accelerometerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_page);
        heading = findViewById(R.id.textView16);
        proximityButton = findViewById(R.id.button57);
        accelerometerButton = findViewById(R.id.button58);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(proximityButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(accelerometerButton);

        proximityButton.setOnClickListener(v -> {

        });
    }
}