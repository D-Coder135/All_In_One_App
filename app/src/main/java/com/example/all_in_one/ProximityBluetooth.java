package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;

public class ProximityBluetooth extends AppCompatActivity {
    SensorManager sensorManager;
    Sensor sensor;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_bluetooth);
    }
}