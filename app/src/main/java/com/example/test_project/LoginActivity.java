package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText username, password;
    Button login;
    String usrname, passwrd, user, pass;
    Intent log1;
    Bundle b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        login = findViewById(R.id.login);

        usrname = "Admin";
        passwrd = "Admin";

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = username.getText().toString();
                pass = password.getText().toString();

                if (user.equals(usrname) && pass.equals(passwrd)) {
//                    Toast.makeText(getApplicationContext(), "Credentials Accepted!", Toast.LENGTH_LONG).show();
                    Intent log1 = new Intent(getApplicationContext(),LoginResult.class);

                    SharedPreferences sh = getSharedPreferences("MySharedPref", MODE_PRIVATE);

                    b1 = new Bundle();
                    b1.putString("username",user);

                    log1.putExtras(b1);
                    startActivity(log1);
                }
                else {
                    Toast.makeText(getApplicationContext(), "Credentials Rejected!", Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
