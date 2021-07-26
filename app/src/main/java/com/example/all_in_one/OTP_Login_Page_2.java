package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

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

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(otpField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(loginButton);

        generateOTP();

        loginButton.setOnClickListener(v -> {
            if (otpField.getText().toString().isEmpty()) {
                Toast.makeText(this, "Enter OTP To Continue!", Toast.LENGTH_SHORT).show();
            } else {
                PhoneAuthCredential credential = PhoneAuthProvider.getCredential(otp, otpField.getText().toString());
            }
        });


    }
}