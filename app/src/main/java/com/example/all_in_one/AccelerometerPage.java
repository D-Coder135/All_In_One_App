package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class AccelerometerPage extends AppCompatActivity {
    Button bluetoothButton, wifiButton, flashButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_page);
        bluetoothButton = findViewById(R.id.button90);
        wifiButton = findViewById(R.id.button91);
        flashButton = findViewById(R.id.button92);
    }
}