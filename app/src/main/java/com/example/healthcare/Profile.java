package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class Profile extends AppCompatActivity {

    LinearLayout AboutLL, ExperienceLL, MassageLL;
    Button AboutBtn, ExperienceBtn, MassageBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        AboutLL = findViewById(R.id.Profile_About);
        ExperienceLL = findViewById(R.id.Profile_Experience);
        MassageLL = findViewById(R.id.Profile_Massage);

        AboutBtn = findViewById(R.id.AboutBTN);
        ExperienceBtn = findViewById(R.id.ExperienceBTN);
        MassageBtn = findViewById(R.id.MassageBTN);
    }

    public void Profile_About(View view) {
        AboutLL.setVisibility(View.VISIBLE);
        ExperienceLL.setVisibility(View.GONE);
        MassageLL.setVisibility(View.GONE);

        AboutBtn.setBackground(getResources().getDrawable(R.drawable.round_sign_up_button));
        ExperienceBtn.setBackground(getResources().getDrawable(R.drawable.round_login_button));
        MassageBtn.setBackground(getResources().getDrawable(R.drawable.round_login_button));
    }

    public void Profile_Experience(View view) {
        AboutLL.setVisibility(View.GONE);
        ExperienceLL.setVisibility(View.VISIBLE);
        MassageLL.setVisibility(View.GONE);

        AboutBtn.setBackground(getResources().getDrawable(R.drawable.round_login_button));
        ExperienceBtn.setBackground(getResources().getDrawable(R.drawable.round_sign_up_button));
        MassageBtn.setBackground(getResources().getDrawable(R.drawable.round_login_button));
    }

    public void Profile_Massage(View view) {
        AboutLL.setVisibility(View.GONE);
        ExperienceLL.setVisibility(View.GONE);
        MassageLL.setVisibility(View.VISIBLE);

        AboutBtn.setBackground(getResources().getDrawable(R.drawable.round_login_button));
        ExperienceBtn.setBackground(getResources().getDrawable(R.drawable.round_login_button));
        MassageBtn.setBackground(getResources().getDrawable(R.drawable.round_sign_up_button));
    }
}