package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.SigningInfo;
import android.os.Bundle;

import com.google.android.gms.common.SignInButton;

public class GmailLoginPage extends AppCompatActivity {
    SignInButton signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_login_page);
    }
}