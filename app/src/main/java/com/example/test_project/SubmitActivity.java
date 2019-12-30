package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {

    Intent i4;
    TextView disp_name, disp_address;
    String display_name, display_address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        disp_name = findViewById(R.id.disp_name);
        disp_address = findViewById(R.id.disp_address);

        i4 = getIntent();
        display_name = i4.getStringExtra("disp_name");
        display_address = i4.getStringExtra("disp_address");

        disp_name.setText(display_name);
        disp_address.setText(display_address);
    }
}
