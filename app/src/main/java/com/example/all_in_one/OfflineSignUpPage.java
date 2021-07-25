package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class OfflineSignUpPage extends AppCompatActivity {
    TextView heading;
    Button signUpButton, backButton;
    EditText emailField, passwordField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline_sign_up_page);
        heading = findViewById(R.id.textView6);
        emailField = findViewById(R.id.editText3);
        passwordField = findViewById(R.id.editText4);
        passwordField.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
        signUpButton = findViewById(R.id.button22);
        backButton = findViewById(R.id.button23);

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(emailField);
        YoYo.with(Techniques.Shake).duration(2500).repeat(0).playOn(passwordField);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(backButton);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(signUpButton);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(OfflineSignUpPage.this, OfflineLoginPage.class);
            startActivity(intent);
            finish();
        });

        signUpButton.setOnClickListener(v -> {
            String email = emailField.getText().toString();
            String password = passwordField.getText().toString();

            if (email.equals("") || password.equals("")) {
                Toast.makeText(this, "Please fill the mandatory fields!", Toast.LENGTH_SHORT).show();
            } else {
                SQLiteDatabase sqLiteDatabase = openOrCreateDatabase("authentication", MODE_PRIVATE, null);
                sqLiteDatabase.execSQL("create table if not exists user (email varchar, password varchar)");
                String query = "select * from user where email = '"+email+"' and password = '"+password+"'";
                Cursor cursor = sqLiteDatabase.rawQuery(query, null);

                if (cursor.getCount() > 0) {
                    Toast.makeText(this, "User Already Exists.", Toast.LENGTH_SHORT).show();
                } else {
                    sqLiteDatabase.execSQL("insert into user values ('"+email+"' , '"+password+"')");
                    Toast.makeText(this, "Registered Successfully! Log In To Continue.", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(OfflineSignUpPage.this, OfflineLoginPage.class);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}