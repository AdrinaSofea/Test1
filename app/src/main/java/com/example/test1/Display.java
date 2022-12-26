package com.example.test1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Display extends AppCompatActivity {
    public final static String USERNAME = "com.example.Test1.USERNAME";
    TextView tvUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        tvUsername = findViewById(R.id.tvUsername);
        Intent intent=getIntent();
        String etUsername = intent.getStringExtra("USERNAME");
        tvUsername.setTextSize(45);
        tvUsername.setText("Welcome " + etUsername);

    }
}