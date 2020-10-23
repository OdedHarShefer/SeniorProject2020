package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityNewPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_plan);
    }

    public void openProgress(View view) {
        Intent i = new Intent(this, ActivityProgress.class);
        startActivity(i);
    }

    public void openCustomPlan(View view) {
        Intent i = new Intent(this, ActivityCustomPlan.class);
        startActivity(i);
    }

    public void openDefaultPlan(View view) {
        Intent i = new Intent(this, ActivityDefaultPlan.class);
        startActivity(i);
    }
}