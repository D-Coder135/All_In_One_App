package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        button = findViewById(R.id.button2);

        YoYo.with(Techniques.SlideInLeft).duration(1500).repeat(0).playOn(textView);
        YoYo.with(Techniques.BounceIn).duration(3000).repeat(0).playOn(button);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, LoginMenu.class);
            startActivity(intent);
            finish();
        });
    }
}