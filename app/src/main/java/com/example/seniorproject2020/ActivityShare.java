package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityShare extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
    }

    public void openSocial(View view) {
        Intent i = new Intent(this, ActivitySocial.class);
        startActivity(i);
    }

    public void openMyProgress(View view) {
        Intent i = new Intent(this, ActivityMyProgress.class);
        startActivity(i);
    }
}