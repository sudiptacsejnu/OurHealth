package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void RegisterAsDoctor(View view) {

        Intent intent = new Intent(this, RegisterAsDoctor.class);
        startActivity(intent);
    }

    public void RegisterasAnalyst(View view) {

        Intent intent = new Intent(this, RegisterAsAnalyst.class);
        startActivity(intent);

    }

    public void RegisterAsPatient(View view) {
        Intent intent = new Intent(this, RegisterAsPatient.class);
        startActivity(intent);
    }
}