package com.example.seniorproject2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openSettings(View view) {
        Intent i = new Intent(this,ActivitySettings.class);
        startActivity(i);
    }

    public void openSocial(View view) {
        Intent i = new Intent(this,ActivitySocial.class);
        startActivity(i);
    }

    public void openRun(View view) {
        Intent i = new Intent(this,ActivityRun.class);
        startActivity(i);
    }
}