package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LoginResult extends AppCompatActivity {

    Intent log2;
    String user, xyz;
    TextView result;
    Bundle b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_result);

        result = findViewById(R.id.result);

        log2 = getIntent();
//        user = log2.getStringExtra("username");
        b2 = log2.getExtras();
        xyz = b2.getString("username");
        result.setText("Congrats "+xyz);
    }
}
