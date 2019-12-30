package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    Intent i2,i3;
    Button submit;
    String display_name, display_address, display_email, display_gender;
//    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

//        display = findViewById(R.id.display);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2 = getIntent();
                display_name = i2.getStringExtra("myname");
                display_address = i2.getStringExtra("myaddress");
                display_email = i2.getStringExtra("myemail");
                display_gender = i2.getStringExtra("mygender");

                i3 = new Intent(getApplicationContext(),SubmitActivity.class);
                i3.putExtra("myname",display_name);
                i3.putExtra("myaddress",display_address);
                i3.putExtra("myemail",display_email);
                i3.putExtra("mygender",display_gender);
                startActivity(i3);

//                Toast.makeText(NextActivity.this, display_name, Toast.LENGTH_SHORT).show();
//                display.setText(display_name);
            }
        });
    }
}
