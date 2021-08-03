package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class SensorPage extends AppCompatActivity {
    TextView heading;
    Button proximityButton, accelerometerButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_page);
        heading = findViewById(R.id.textView16);
        proximityButton = findViewById(R.id.button57);
        accelerometerButton = findViewById(R.id.button58);
        backButton = findViewById(R.id.button59);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(proximityButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(accelerometerButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(backButton);

        proximityButton.setOnClickListener(v -> {
            Intent intent = new Intent(SensorPage.this, ProximityPage.class);
            startActivity(intent);
            finish();
        });

        accelerometerButton.setOnClickListener(v -> {
            Intent intent = new Intent(SensorPage.this, AccelerometerPage.class);
            startActivity(intent);
            finish();
        });

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(SensorPage.this, HomePage.class);
            startActivity(intent);
            finish();
        });
    }
}