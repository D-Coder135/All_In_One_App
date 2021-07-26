package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.auth.FirebaseAuth;

public class EmailLoginPage extends AppCompatActivity {
    TextView heading;
    Button loginButton, signUpButton;
    EditText emailField, passwordField;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_login_page);
        heading = findViewById(R.id.textView8);
        emailField = findViewById(R.id.editText10);
        passwordField = findViewById(R.id.editText11);
        passwordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        loginButton = findViewById(R.id.button25);
        signUpButton = findViewById(R.id.button26);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(emailField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(passwordField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(loginButton);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(signUpButton);
    }
}