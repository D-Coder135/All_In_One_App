package com.example.all_in_one;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

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

        YoYo.with(Techniques.RollIn).duration(1000).repeat(0).playOn(textView);
        YoYo.with(Techniques.RotateInUpRight).duration(2000).repeat(0).playOn(offlineButton);
        YoYo.with(Techniques.RotateInUpRight).duration(2000).repeat(0).playOn(emailButton);
        YoYo.with(Techniques.RotateInDownRight).duration(2000).repeat(0).playOn(gmailButton);
        YoYo.with(Techniques.RotateInDownRight).duration(2000).repeat(0).playOn(otpButton);

        offlineButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginMenu.this, OfflineLoginPage.class);
            startActivity(intent);
            finish();
        });

        emailButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginMenu.this, EmailLoginPage.class);
            startActivity(intent);
            finish();
        });

        gmailButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginMenu.this, GmailLoginPage.class);
            startActivity(intent);
            finish();
        });

        otpButton.setOnClickListener(v -> {
            Intent intent = new Intent(LoginMenu.this, OTP_Login_Page.class);
            startActivity(intent);
            finish();
        });
    }
}