package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HealthCareProveider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_care_proveider);
    }

    public void Timeline(View view) {

        Intent intent = new Intent(this, Timeline.class);
        startActivity(intent);
    }

    public void Profile(View view) {

        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }

    public void DoctorSuccessStories(View view) {

        Intent intent = new Intent(this, DoctorSuccessStories.class);
        startActivity(intent);
    }

    public void Contuct_Us(View view) {

        Intent intent = new Intent(this, Contact_Us.class);
        startActivity(intent);
    }

    public void Patients(View view) {

        Intent intent = new Intent(this, Timeline.class);
        startActivity(intent);
    }

    public void Practice_areas(View view) {

        Intent intent = new Intent(this, Practice_Area.class);
        startActivity(intent);
    }
}