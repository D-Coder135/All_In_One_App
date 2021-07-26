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

public class EmailSignUpPage extends AppCompatActivity {
    TextView heading;
    Button signUpButton, backButton;
    EditText emailField, passwordField;
    ProgressBar progressBar;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email_sign_up_page);
        heading = findViewById(R.id.textView10);
        emailField = findViewById(R.id.editText12);
        passwordField = findViewById(R.id.editText13);
        passwordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        signUpButton = findViewById(R.id.button27);
        backButton = findViewById(R.id.button28);
        progressBar = findViewById(R.id.progressBar1);
        firebaseAuth = FirebaseAuth.getInstance();

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(emailField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(passwordField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(signUpButton);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(backButton);

        backButton.setOnClickListener(v -> {

        });

    }
}