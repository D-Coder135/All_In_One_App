package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.hbb20.CountryCodePicker;

public class OTP_Login_Page extends AppCompatActivity {
    CountryCodePicker countryCodePicker;
    TextView heading;
    EditText numberField;
    Button getOTPButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_login_page);
        heading = findViewById(R.id.textView12);
        numberField = findViewById(R.id.editText40);
        getOTPButton = findViewById(R.id.button40);
        countryCodePicker = findViewById(R.id.ccp);
        countryCodePicker.registerCarrierNumberEditText(numberField);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(numberField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(getOTPButton);

        getOTPButton.setOnClickListener(v -> {
            Intent intent = new Intent(OTP_Login_Page.this, OTP_Login_Page_2.class);
            intent.putExtra("mobile", countryCodePicker.getFullNumberWithPlus().trim());
        });
    }
}