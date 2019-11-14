package com.example.software_engineering_one_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final DatabaseHelper db;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        db = new DatabaseHelper(this);
        final EditText userName = (EditText) findViewById(R.id.enter_username);
        final EditText userEmail = (EditText) findViewById(R.id.enter_email);
        final EditText userPassword = (EditText) findViewById(R.id.enter_password);
        final Button regButton = (Button) findViewById(R.id.create_account);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String username = userName.getText().toString().trim();
                final String useremail = userEmail.getText().toString().trim();
                final String password = userPassword.getText().toString().trim();

                long val = db.addUser(username, useremail, password);
                if (val > 0) {
                    Toast.makeText(RegisterActivity.this, "You have registered", Toast.LENGTH_SHORT).show();
                    Intent moveToLogin = new Intent(RegisterActivity.this, Main2Activity.class);
                    startActivity(moveToLogin);
                } else {
                    Toast.makeText(RegisterActivity.this, "Registration error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

