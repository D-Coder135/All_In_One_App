package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

public class AccelerometerFlash extends AppCompatActivity {
    Button backButton;
    SensorManager sensorManager;
    Sensor sensor;
    CameraManager cameraManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_flash);
    }
}