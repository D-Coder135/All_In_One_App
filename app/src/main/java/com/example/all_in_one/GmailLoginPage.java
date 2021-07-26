package com.example.all_in_one;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.GoogleAuthProvider;

import org.jetbrains.annotations.NotNull;

public class GmailLoginPage extends AppCompatActivity {
    TextView heading;
    SignInButton signInButton;
    FirebaseAuth firebaseAuth;
    GoogleSignInClient googleSignInClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gmail_login_page);
        heading = findViewById(R.id.textView11);
        signInButton = findViewById(R.id.signIn);
        firebaseAuth = FirebaseAuth.getInstance();

        YoYo.with(Techniques.FlipInX).duration(1500).repeat(0).playOn(heading);
        YoYo.with(Techniques.FlipInX).duration(3000).repeat(0).playOn(signInButton);


        GoogleSignInOptions googleSignInOptions = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestIdToken("193484657689-s84t6u8n12blifecfb9qih44p7g72o6q.apps.googleusercontent.com").requestEmail().build();
        googleSignInClient = GoogleSignIn.getClient(GmailLoginPage.this, googleSignInOptions);

        signInButton.setOnClickListener(v -> {
            Intent intent = googleSignInClient.getSignInIntent();
            startActivityForResult(intent, 200);
        });

        FirebaseUser firebaseUser = firebaseAuth.getCurrentUser();
        if (firebaseUser != null) {
            Intent intent = new Intent(GmailLoginPage.this, DatabasePage.class);
            startActivity(intent);
            finish();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable @org.jetbrains.annotations.Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 200) {
            Task<GoogleSignInAccount> signInAccountTask = GoogleSignIn.getSignedInAccountFromIntent(data);

            if (signInAccountTask.isSuccessful()) {
                Toast.makeText(this, "Signed In With Google.", Toast.LENGTH_SHORT).show();
                try {
                    GoogleSignInAccount googleSignInAccount = signInAccountTask.getResult(ApiException.class);
                    if (googleSignInAccount != null) {
                        AuthCredential authCredential = GoogleAuthProvider.getCredential(googleSignInAccount.getIdToken(), null);
                        firebaseAuth.signInWithCredential(authCredential).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull @NotNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    Toast.makeText(GmailLoginPage.this, "Firebase Database Updated!", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(GmailLoginPage.this, DatabasePage.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(GmailLoginPage.this, "Something Went Wrong!", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
                    }
                } catch (ApiException exception) {
                    System.out.println(exception);
                }
            }
        }
    }
}