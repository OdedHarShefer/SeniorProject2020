package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityMyProgress extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_progress);
    }

    public void openStartRun(View view) {
        Intent i = new Intent(this, ActivityStartRun.class);
        startActivity(i);
    }

    public void openProgress(View view) {
        Intent i = new Intent(this, ActivityProgress.class);
        startActivity(i);
    }

    public void openShare(View view) {
        Intent i = new Intent(this, ActivityShare.class);
        startActivity(i);
    }
}