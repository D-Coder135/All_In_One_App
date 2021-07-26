package com.example.all_in_one;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
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
        progressBar = findViewById(R.id.progressBar);
        firebaseAuth = FirebaseAuth.getInstance();

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(emailField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(passwordField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(loginButton);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(signUpButton);

        signUpButton.setOnClickListener(v -> {
            Intent intent = new Intent(EmailLoginPage.this, EmailSignUpPage.class);
            startActivity(intent);
            finish();
        });

        loginButton.setOnClickListener(v -> {
            String email = emailField.getText().toString();
            String password = passwordField.getText().toString();

            if (email.isEmpty()) {
                emailField.setError("Email Field Can't Be Empty!");
            } else {
                if (password.isEmpty()) {
                    passwordField.setError("Password Field Can't Be Empty!");
                }
            }
            progressBar.setVisibility(View.VISIBLE);
            firebaseAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull @org.jetbrains.annotations.NotNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(EmailLoginPage.this, "Logged In Successfully!", Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.INVISIBLE);
                        Intent intent = new Intent(EmailLoginPage.this, DatabasePage.class);
                        startActivity(intent);
                        finish();
                    } else {
                        Toast.makeText(EmailLoginPage.this, "Invalid Details!", Toast.LENGTH_SHORT).show();
                        progressBar.setVisibility(View.INVISIBLE);

                    }
                }
            });
        });
    }
}