package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name, address, email, dob, mobile;
    String sname, saddress, semail, smobile, sgender;
    Button next;
    RadioGroup gender;
    RadioButton temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        dob = findViewById(R.id.dob);
        mobile = findViewById(R.id.mobile);
        gender = findViewById(R.id.gender);
        next = findViewById(R.id.next);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                sname = name.getText().toString();
                saddress = address.getText().toString();
                semail = email.getText().toString();

                int xyz = gender.getCheckedRadioButtonId();
                temp = findViewById(xyz);
                sgender = temp.getText().toString();

                Intent i1 = new Intent(getApplicationContext(),NextActivity.class);
                i1.putExtra("myname", sname);
                i1.putExtra("myaddress",saddress);
                i1.putExtra("myemail",semail);
                i1.putExtra("mygender",sgender);

//                Toast.makeText(MainActivity.this, sgender , Toast.LENGTH_LONG).show();
                startActivity(i1);
            }
        });
        }

    }
