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

        Intent intent = new Intent(this, Timeline.class);
        startActivity(intent);
    }

    public void Profile(View view) {

        Intent intent = new Intent(this, Profile.class);
        startActivity(intent);
    }
}