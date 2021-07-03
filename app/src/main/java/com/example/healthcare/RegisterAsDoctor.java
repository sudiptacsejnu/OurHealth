package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RegisterAsDoctor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_as_doctor);
    }

    public void RegisterAsDoctorSubmit(View view) {

        Intent intent = new Intent(this, Registration_Common_Info.class);
        startActivity(intent);
    }
}