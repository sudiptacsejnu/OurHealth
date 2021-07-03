package com.example.healthcare;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Data_Analyst_Panel extends AppCompatActivity {

    ImageView HistogramIMG, PieChartIMG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data__analyst__panel);

        HistogramIMG = findViewById(R.id.Histogram_Img);
        PieChartIMG = findViewById(R.id.Pie_Img);
    }

    public void Histogram(View view) {
        HistogramIMG.setVisibility(View.VISIBLE);
        PieChartIMG.setVisibility(View.GONE);
    }

    public void PieChart(View view) {
        HistogramIMG.setVisibility(View.GONE);
        PieChartIMG.setVisibility(View.VISIBLE);
    }
}