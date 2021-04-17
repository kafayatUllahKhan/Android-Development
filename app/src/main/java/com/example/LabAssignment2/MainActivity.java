package com.example.LabAssignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button sendDataBtn;
    private EditText emailET, usernameET;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        sendDataBtn = findViewById(R.id.senddata);
        emailET = findViewById(R.id.email);
        usernameET = findViewById(R.id.username);
        sendDataBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = emailET.getText().toString();
                String username = usernameET.getText().toString();

                Intent i = new Intent(MainActivity.this, SecondActivity.class);
                i.putExtra("email", email);
                i.putExtra("username", username);

                startActivity(i);
            }
        });
    }
}