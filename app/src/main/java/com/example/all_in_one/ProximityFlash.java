package com.example.all_in_one;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ProximityFlash extends AppCompatActivity {
    SensorManager sensorManager;
    Sensor sensor;
    CameraManager cameraManager;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_flash);
    }
}