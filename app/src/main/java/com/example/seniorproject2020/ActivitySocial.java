package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ActivitySocial extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social);
    }

    public void openMainMenu(View view) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void openSearchTracks(View view) {
        Intent i = new Intent(this, ActivitySearchTrack.class);
        startActivity(i);
    }

    public void openFriends(View view) {
        Intent i = new Intent(this, ActivityFriends.class);
        startActivity(i);
    }

    public void openShare(View view) {
        Intent i = new Intent(this, ActivityShare.class);
        startActivity(i);
    }
}