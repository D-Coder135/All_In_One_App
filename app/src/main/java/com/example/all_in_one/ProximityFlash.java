package com.example.all_in_one;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.widget.Button;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

public class ProximityFlash extends AppCompatActivity implements SensorEventListener {
    SensorManager sensorManager;
    Sensor sensor;
    CameraManager cameraManager;
    Button backButton;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proximity_flash);
        backButton = findViewById(R.id.button67);
        cameraManager = (CameraManager)getSystemService(CAMERA_SERVICE);
        sensorManager = (SensorManager)getSystemService(SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        sensorManager.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(ProximityFlash.this, ProximityPage.class);
            startActivity(intent);
            finish();
        });
    }

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.values[0] > 10) {
            try {
                String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraIdForFlashlight, true);
            } catch (CameraAccessException exception) {
                System.out.println(exception);
            }
        } else {
            try {
                String cameraIdForFlashlight = cameraManager.getCameraIdList()[0];
                cameraManager.setTorchMode(cameraIdForFlashlight, false);
            } catch (CameraAccessException exception) {
                System.out.println(exception);
            }
        }

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}