package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.Button;

public class ProximityWifi extends AppCompatActivity implements SensorEventListener {
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

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProximityWifi.this, ProximityPage.class);
            startActivity(intent);
            finish();
        });
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        wifiManager.setWifiEnabled(event.values[0] > 10);

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}