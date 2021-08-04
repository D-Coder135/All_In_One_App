package com.example.all_in_one;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

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
            startActivity(intent);
            finish();
        });

        loginButton.setOnClickListener(v -> {
            String email = emailField.getText().toString();
            String password = passwordField.getText().toString();

            if (email.equals("") || password.equals("")) {
                Toast.makeText(this, "Please fill the mandatory fields!", Toast.LENGTH_SHORT).show();
            } else {
                SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("authentication", MODE_PRIVATE, null);
                String query = "select * from user where email ='"+email+"' and password = '"+password+"'";
                Cursor cursor = sqLiteDatabase.rawQuery(query, null);

                if (cursor.getCount() > 0) {
                    Toast.makeText(this, "Logged In Successfully!", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OfflineLoginPage.this, DatabasePage.class);
                    startActivity(intent);
                    finish();
                } else {
                    Toast.makeText(this, "Invalid Details!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}