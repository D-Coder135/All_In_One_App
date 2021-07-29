package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SensorPage extends AppCompatActivity {
    TextView heading;
    Button proximityButton, accelerometerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_page);
        heading = findViewById(R.id.textView16);
        proximityButton = findViewById(R.id.button57);
    }
}