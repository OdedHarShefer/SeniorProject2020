package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityStartRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_run);
    }

    public void openShare(View view) {
        Intent i = new Intent(this, ActivityShare.class);
        startActivity(i);
    }

    public void openMyProgress(View view) {
    }
}