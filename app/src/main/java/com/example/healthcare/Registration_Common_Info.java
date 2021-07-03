package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Registration_Common_Info extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__common__info);
    }

    public void RegisterComInfo(View view) {

        Intent intent = new Intent(this, General_Activity.class);
        startActivity(intent);
    }
}