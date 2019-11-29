package com.example.software_engineering_one_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GoalsCalculated extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goals_calculated);

        final Button next = (Button) findViewById(R.id.button_next);
        //add setText

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    //Insert code to save to DB: goal
                    Intent moveToGoalsCalculated = new Intent(GoalsCalculated.this, HomeActivity.class);
                    startActivity(moveToGoalsCalculated);
            }
        });
}}
