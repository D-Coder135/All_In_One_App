package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;

public class AccelerometerBluetooth extends AppCompatActivity {
    Button backButton;
    SensorManager sensorManager;
    Sensor sensor;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_bluetooth);
    }
}