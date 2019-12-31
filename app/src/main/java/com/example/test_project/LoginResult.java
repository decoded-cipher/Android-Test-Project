package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginResult extends AppCompatActivity {

    Intent log2;
    String user;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);

        result = findViewById(R.id.result);

        log2 = getIntent();
        user = log2.getStringExtra("username");

        result.setText("Congrats "+user);
    }
}
