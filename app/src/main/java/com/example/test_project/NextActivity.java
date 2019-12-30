package com.example.test_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class NextActivity extends AppCompatActivity {

    Intent i2;
    Button submit;
    String display_name;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);

        display = findViewById(R.id.display);

        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i2 = getIntent();
                display_name = i2.getStringExtra("myname");
//                Toast.makeText(NextActivity.this, display_name, Toast.LENGTH_SHORT).show();
                display.setText(display_name);
            }
        });
    }
}
