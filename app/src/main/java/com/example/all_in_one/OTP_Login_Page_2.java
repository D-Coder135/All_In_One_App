package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class OTP_Login_Page_2 extends AppCompatActivity {
    TextView heading;
    EditText otpField;
    Button loginButton;
    FirebaseAuth firebaseAuth;
    String mobileNumber;
    String otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_login_page2);
        mobileNumber = getIntent().getStringExtra("mobile").toString();
        heading = findViewById(R.id.textView13);
        otpField = findViewById(R.id.editText41);
        loginButton = findViewById(R.id.button41);
        firebaseAuth = FirebaseAuth.getInstance();
    }
}