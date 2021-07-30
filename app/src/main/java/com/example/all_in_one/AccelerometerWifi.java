package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

public class AccelerometerWifi extends AppCompatActivity implements SensorEventListener {
    Button backButton;
    SensorManager sensorManager;
    Sensor sensor;
    WifiManager wifiManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_wifi);
        backButton = findViewById(R.id.button231);
        wifiManager = (WifiManager)getApplicationContext().getSystemService(WIFI_SERVICE);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(AccelerometerWifi.this, AccelerometerPage.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        float x = event.values[0];
        float y = event.values[1];
        float z = event.values[2];
        int x1 = (int)x;
        int y1 = (int)y;
        int z1 = (int)z;

        wifiManager.setWifiEnabled(x1 != 0 || y1 != 0 || z1 != 0);
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}