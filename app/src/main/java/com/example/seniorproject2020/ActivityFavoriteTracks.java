package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivityFavoriteTracks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_tracks);
    }

    public void openRun(View view) {
        Intent i = new Intent(this, ActivityRun.class);
        startActivity(i);
    }

    public void openStartRun(View view) {
    }
}