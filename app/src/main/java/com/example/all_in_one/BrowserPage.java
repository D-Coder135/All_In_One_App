package com.example.all_in_one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class BrowserPage extends AppCompatActivity {
    WebView webView;
    EditText editText;
    Button searchButton, backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_page);
        webView = findViewById(R.id.webView);
        editText = findViewById(R.id.editTextWeb);
        searchButton = findViewById(R.id.button820);
        backButton = findViewById(R.id.button821);

        backButton.setOnClickListener(v -> {
            Intent intent = new Intent(BrowserPage.this, HomePage.class);
            startActivity(intent);
            finish();
        });

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String urlText = editText.getText().toString();
                webView.loadUrl(urlText);
            }
        });
    }
}