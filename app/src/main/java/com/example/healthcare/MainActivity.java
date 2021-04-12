package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText sign_in_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sign_in_id = findViewById(R.id.login_uID);


    }

    public void Sign_in(View view) {
        Toast.makeText(this, sign_in_id.getText(), Toast.LENGTH_SHORT).show();
        if (sign_in_id.getText().toString().equals("analyst")){
            Intent intent = new Intent(this, Data_Analyst_Panel.class);
            startActivity(intent);
        }
        else if(sign_in_id.getText().toString().equals("doctor")){

            Intent intent = new Intent(this, HealthCareProveider.class);
            startActivity(intent);

        }
        else if(sign_in_id.getText().toString().equals("patient")){

            Intent intent = new Intent(this, Patient_Panel.class);
            startActivity(intent);

        }
    }

    public void SignUp(View view) {

        Intent intent = new Intent(this, SignUp.class);
        startActivity(intent);
    }
}