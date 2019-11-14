package com.example.software_engineering_one_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Gender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gender);

        final RadioGroup radioGender = (RadioGroup) findViewById(R.id.radioGender)
        final RadioButton gender;
        final EditText heightFeet = (EditText) findViewById(R.id.height_feet);
        final EditText heightInches = (EditText) findViewById(R.id.height_inches);
        final EditText weight = (EditText) findViewById(R.id.weight);
        final Button nextButton = (Button) findViewById(R.id.button_next);

        int selectedButton = radioGender.getCheckedRadioButtonId();
        gender = (RadioButton) findViewById(selectedButton);

		/* Add DB table code to save: gender, height (feet,inches), weight
		long val = db.addUser(username,useremail,password);
		 */

		nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // FILL IN NEXT LINE //
                if () {
                    Intent moveToGetgoal = new Intent(Gender.this, Birthday.class);
                    startActivity(moveToGetgoal);
                }
                else {
                    Toast.makeText(Gender.this, "Please enter your information", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
