package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class LoginMenu extends AppCompatActivity {
    TextView textView;
    Button offlineButton, emailButton, gmailButton, otpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);
        textView = findViewById(R.id.textView2);
        offlineButton = findViewById(R.id.button50);
        emailButton = findViewById(R.id.button51);
        gmailButton = findViewById(R.id.button52);
        otpButton = findViewById(R.id.button53);

        YoYo.with(Techniques.RollIn).repeat(0).playOn(textView);
        YoYo.with(Techniques.RotateInUpLeft).duration(2000).repeat(0).playOn(offlineButton);
    }
}