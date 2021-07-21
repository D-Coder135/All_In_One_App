package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginMenu extends AppCompatActivity {
    TextView textView;
    Button offlineButton, emailButton, gmailButton, otpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_menu);
        textView = findViewById(R.id.textView2);
    }
}