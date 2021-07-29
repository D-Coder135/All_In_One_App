package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DatabasePage extends AppCompatActivity {
    TextView heading;
    EditText nameField, emailField, passwordField, mobileField;
    Button updateButton, continueButton;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_database_page);
        heading = findViewById(R.id.textView14);
        nameField = findViewById(R.id.editText70);
        emailField = findViewById(R.id.editText71);
        passwordField = findViewById(R.id.editText72);
        mobileField = findViewById(R.id.editText73);
    }
}