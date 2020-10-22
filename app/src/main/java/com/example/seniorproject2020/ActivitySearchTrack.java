package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySearchTrack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_track);
    }

    public void openSocial(View view) {
        Intent i = new Intent(this, ActivitySocial.class);
        startActivity(i);
    }

    public void openStartRun(View view) {
        Intent i = new Intent(this, ActivityStartRun.class);
        startActivity(i);
    }
}