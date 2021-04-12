package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.concurrent.locks.Condition;

public class General_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_general_);
    }

    public void Timeline(View view) {

        Intent intent = new Intent(this, Timeline.class);
        startActivity(intent);
    }

    public void condition(View view) {

        Intent intent = new Intent(this, conditions.class);
        startActivity(intent);
    }

    public void Signup(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void Treatments(View view) {

        Intent intent = new Intent(this, Treatments.class);
        startActivity(intent);
    }

    public void Symptoms(View view) {

        Intent intent = new Intent(this, Symptoms.class);
        startActivity(intent);
    }

    public void About(View view) {

        Intent intent = new Intent(this, About.class);
        startActivity(intent);
    }
}