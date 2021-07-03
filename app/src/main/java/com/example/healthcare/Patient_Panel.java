package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Patient_Panel extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient__panel);
    }

    public void Timeline(View view) {

        Intent intent = new Intent(this, Timeline_Patient.class);
        startActivity(intent);
    }

    public void Profile(View view) {

        Intent intent = new Intent(this, PatientProfile.class);
        startActivity(intent);
    }

    public void About(View view) {

        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }

    public void Contact_Us(View view) {

        Intent intent = new Intent(this, Contact_Us.class);
        startActivity(intent);
    }

    public void Recent_Health_Status(View view) {

        Intent intent = new Intent(this, Timeline_Patient.class);
        startActivity(intent);
    }

    public void Past_health_Status(View view) {

        Intent intent = new Intent(this, Timeline_Patient.class);
        startActivity(intent);
    }
}