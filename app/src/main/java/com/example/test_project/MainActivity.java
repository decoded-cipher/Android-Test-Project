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
    String sname, saddress, semail;
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

//        String saddress = address.getText().toString();
//        String semail = email.getText().toString();

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int xyz = gender.getCheckedRadioButtonId();
                temp = findViewById(xyz);

                Intent i1 = new Intent(getApplicationContext(),NextActivity.class);

                sname = name.getText().toString();
                saddress = address.getText().toString();

                i1.putExtra("myname", sname);
                i1.putExtra("myaddress",saddress);


                Toast.makeText(MainActivity.this, temp.getText() , Toast.LENGTH_LONG).show();
                startActivity(i1);
            }
        });
        }

    }
