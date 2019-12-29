package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText name, address, email, gender, dob, mobile;
//        final String sname, saddress, semail;
        Button next;

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        dob = findViewById(R.id.dob);
        mobile = findViewById(R.id.mobile);
        next = findViewById(R.id.next);



        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this,NextActivity.class);
//                startActivity(intent);
                String sname = name.getText().toString();
                String saddress = address.getText().toString();
                String semail = email.getText().toString();

                Toast.makeText(MainActivity.this, "Hello Bro...!!!", Toast.LENGTH_LONG).show();
            }
        });
    }
}
