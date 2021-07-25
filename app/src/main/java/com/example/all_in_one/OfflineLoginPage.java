package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class OfflineLoginPage extends AppCompatActivity {
    TextView heading;
    Button loginButton, signUpButton;
    EditText emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_login_page);
        heading = findViewById(R.id.textView4);
        emailField = findViewById(R.id.editText1);
        passwordField = findViewById(R.id.editText2);
        passwordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        loginButton = findViewById(R.id.button20);
        signUpButton = findViewById(R.id.button21);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(emailField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(passwordField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(loginButton);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(signUpButton);

        signUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(OfflineLoginPage.this, OfflineSignUpPage.class);

        });

    }
}