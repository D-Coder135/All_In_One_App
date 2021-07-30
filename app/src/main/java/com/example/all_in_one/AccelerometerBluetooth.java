package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.Button;

public class AccelerometerBluetooth extends AppCompatActivity implements SensorEventListener {
    Button backButton;
    SensorManager sensorManager;
    Sensor sensor;
    BluetoothAdapter bluetoothAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accelerometer_bluetooth);
        backButton = findViewById(R.id.button230);
        bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(AccelerometerBluetooth.this, AccelerometerPage.class);
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

        if (x1 != 0 || y1 !=0 || z1 != 0) {
            bluetoothAdapter.enable();
        } else {
            bluetoothAdapter.disable();
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}