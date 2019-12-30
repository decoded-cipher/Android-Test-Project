package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, address, email, gender, dob, mobile;
    String sname, saddress, semail;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        dob = findViewById(R.id.dob);
        mobile = findViewById(R.id.mobile);
        next = findViewById(R.id.next);

//        String saddress = address.getText().toString();
//        String semail = email.getText().toString();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String sname = name.getText().toString();
                Intent i1 = new Intent(getApplicationContext(),NextActivity.class);
                i1.putExtra("myname", sname);
//                Toast.makeText(MainActivity.this,sname, Toast.LENGTH_SHORT).show();
                startActivity(i1);
            }
        });
        }

    }
