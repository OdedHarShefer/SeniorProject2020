package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityRun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_run);
    }

    public void openMainMenu(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openFavoriteTracks(View view) {
        Intent i = new Intent(this, ActivityFavoriteTracks.class);
        startActivity(i);
    }

    public void openGenerateTracks(View view) {
        Intent i = new Intent(this, ActivityGenerateTrack.class);
        startActivity(i);
    }

    public void openRecommendedTracks(View view) {
        Intent i = new Intent(this, ActivityRecommendedTracks.class);
        startActivity(i);
    }
}