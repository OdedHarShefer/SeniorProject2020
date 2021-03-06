package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityRecommendedTracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activiy_recommended_tracks);
    }

    public void openRun(View view) {
        Intent i = new Intent(this, ActivityRun.class);
        startActivity(i);
    }

    public void openSearchTrack(View view) {
        Intent i = new Intent(this, ActivitySearchTrack.class);
        startActivity(i);
    }
}