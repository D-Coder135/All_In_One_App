package com.example.all_in_one;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.TimeUnit;

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
                signInWithPhoneAuthCredential(credential);
            }
        });
    }

    private void generateOTP() {
        PhoneAuthProvider.getInstance().verifyPhoneNumber(
                mobileNumber,
                60,
                TimeUnit.SECONDS,
                this,
                new PhoneAuthProvider.OnVerificationStateChangedCallbacks() {

                    @Override
                    public void onCodeSent(@NonNull @NotNull String s, @NonNull @NotNull PhoneAuthProvider.ForceResendingToken forceResendingToken) {
                        super.onCodeSent(s, forceResendingToken);
                        otp = s;
                    }

                    @Override
                    public void onVerificationCompleted(@NonNull @NotNull PhoneAuthCredential phoneAuthCredential) {
                        signInWithPhoneAuthCredential(phoneAuthCredential);
                    }

                    @Override
                    public void onVerificationFailed(@NonNull @NotNull FirebaseException e) {
                        Toast.makeText(OTP_Login_Page_2.this, "OTP Mismatch!!", Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        firebaseAuth.signInWithCredential(credential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Toast.makeText(OTP_Login_Page_2.this, "Logged In Successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OTP_Login_Page_2.this, DatabasePage.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(OTP_Login_Page_2.this, "Error! Cannot Log In.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}