package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityDefaultPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default_plan);
    }

    public void openNewPlan(View view) {
        Intent i = new Intent(this, ActivityCustomPlan.class);
        startActivity(i);
    }
}