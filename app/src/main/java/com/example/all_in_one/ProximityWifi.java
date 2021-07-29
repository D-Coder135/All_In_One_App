package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

public class ProximityWifi extends AppCompatActivity {
    SensorManager sensorManager;
    Sensor sensor;
    WifiManager wifiManager;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_wifi);
        backButton = findViewById(R.id.button79);
        wifiManager = (WifiManager) getApplicationContext().getSystemService(WIFI_SERVICE);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }
}