package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterAsPatient extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_as_patient);
    }

    public void RegisterAsPatientSubmit(View view) {

        Intent intent = new Intent(this, General_Activity.class);
        startActivity(intent);

    }
}