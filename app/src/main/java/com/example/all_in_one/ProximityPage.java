package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class ProximityPage extends AppCompatActivity {
    Button bluetoothButton, wifiButton, flashButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_page);
        bluetoothButton = findViewById(R.id.button60);
        wifiButton = findViewById(R.id.button61);
        flashButton = findViewById(R.id.button62);

        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(bluetoothButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(wifiButton);
        YoYo.with(Techniques.FlipInY).duration(2800).repeat(0).playOn(flashButton);

        bluetoothButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProximityPage.this, ProximityBluetooth.class);
            startActivity(intent);
            finish();
        });

        wifiButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProximityPage.this, ProximityWifi.class);
            startActivity(intent);
            finish();
        });

        flashButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProximityPage.this, ProximityFlash.class);
            startActivity(intent);
            finish();
        });

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProximityPage.this, SensorPage.class);
            startActivity(intent);
            finish();
        });
    }
}