package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class EmailSignUpPage extends AppCompatActivity {
    TextView heading;
    Button loginButton, signUpButton;
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
        loginButton = findViewById(R.id.button27);
        signUpButton = findViewById(R.id.button28);
        progressBar = findViewById(R.id.progressBar1);
        firebaseAuth = FirebaseAuth.getInstance();
    }
}