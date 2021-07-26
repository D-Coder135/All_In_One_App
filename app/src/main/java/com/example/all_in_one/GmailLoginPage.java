package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.SigningInfo;
import android.os.Bundle;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.firebase.auth.FirebaseAuth;

public class GmailLoginPage extends AppCompatActivity {
    SignInButton signInButton;
    FirebaseAuth firebaseAuth;
    GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_login_page);
        signInButton = findViewById(R.id.signIn);
        firebaseAuth = FirebaseAuth.getInstance();

        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("193484657689-s84t6u8n12blifecfb9qih44p7g72o6q.apps.googleusercontent.com").requestEmail().build();
    }
}