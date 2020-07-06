package com.priyanshnama.km_miles_conversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_main);
        Button tokm = findViewById(R.id.tokm);
        Button tomiles = findViewById(R.id.tomiles);
        EditText miles = findViewById(R.id.miles);
        EditText km = findViewById(R.id.km);
        DecimalFormat format = new DecimalFormat("##.##");
        tokm.setOnClickListener(v -> km.setText("" + format.format((Double.valueOf(miles.getText().toString()))/0.62137)));
        tomiles.setOnClickListener(v -> miles.setText("" + format.format(Double.valueOf(km.getText().toString())*0.62137)));
    }
}