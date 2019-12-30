package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SubmitActivity extends AppCompatActivity {

    Intent i4;
    TextView disp_name, disp_address, disp_email, disp_gender;
    String display_name, display_address, display_email, display_gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit);

        disp_name = findViewById(R.id.disp_name);
        disp_address = findViewById(R.id.disp_address);
        disp_email = findViewById(R.id.disp_email);
        disp_gender = findViewById(R.id.disp_gender);

        i4 = getIntent();
        display_name = i4.getStringExtra("myname");
        display_address = i4.getStringExtra("myaddress");
        display_email = i4.getStringExtra("myemail");
        display_gender = i4.getStringExtra("mygender");

        disp_name.setText(display_name);
        disp_address.setText(display_address);
        disp_email.setText(display_email);
        disp_gender.setText(display_gender);
    }
}
