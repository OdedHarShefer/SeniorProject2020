package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
    }

    public void openMainMenu(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openNewPlan(View view) {
        Intent i = new Intent(this, ActivityNewPlan.class);
        startActivity(i);
    }

    public void openMyProgress(View view) {
        Intent i = new Intent(this, ActivityMyProgress.class);
        startActivity(i);
    }
}