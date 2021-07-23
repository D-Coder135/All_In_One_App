package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OfflineLoginPage extends AppCompatActivity {
    TextView heading;
    Button loginButton, signUpButton;
    EditText emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_login_page);
        heading = findViewById(R.id.textView4);
        loginButton = findViewById(R.id.button20);
        signUpButton = findViewById(R.id.button21);
        emailField = findViewById(R.id.editText1);
        passwordField = findViewById(R.id.editText2);
    }
}