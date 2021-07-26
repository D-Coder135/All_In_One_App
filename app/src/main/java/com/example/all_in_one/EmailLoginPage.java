package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class EmailLoginPage extends AppCompatActivity {
    TextView heading;
    Button loginButton, signUpButton;
    EditText emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login_page);
        heading = findViewById(R.id.textView8);
        emailField = findViewById(R.id.editText10);
        passwordField = findViewById(R.id.editText11);
    }
}