package com.example.pro_athletestats;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBasketballActivity(View view) {
        Intent intentToOpenArtistActivity = new Intent(this, BasketballActivity.class);
        startActivity(intentToOpenArtistActivity);
    }

    public void openBaseballActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, BaseballActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }

    public void openFootballActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, FootballActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }

    public void openSoccerActivity(View view) {
        Intent intentToOpenAlbumActivity = new Intent(this, SoccerActivity.class);
        startActivity(intentToOpenAlbumActivity);
    }

}
