package com.example.software_engineering_one_project.;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.widget.DatePicker;


public class Birthday extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday);

        DatePicker datePicker = (DatePicker)findViewById(R.id.datepicker);
        datePicker.setSpinnersShown(false);
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year = datePicker.getYear();
        final Button nextButton = (Button) findViewById(R.id.button_next);

        // Insert code to save to DB //

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FILL IN NEXT LINE //
                if () {
                    Intent moveToGetgoal = new Intent(Birthday.this, GetGoal.class);
                    startActivity(moveToGetgoal);
                }
                else {
                    Toast.makeText(Birthday.this, "Select your birthday", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
