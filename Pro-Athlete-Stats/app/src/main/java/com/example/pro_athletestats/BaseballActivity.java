package com.example.pro_athletestats;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BaseballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baseball);

        ArrayList<TeamItem> baseball = new ArrayList<>();
        baseball.add(new TeamItem("Chicago Cubs", R.drawable.badge_cubs));
        baseball.add(new TeamItem("New York Mets", R.drawable.badge_mets));
        baseball.add(new TeamItem("New York Yankees", R.drawable.badge_yankees));
        baseball.add(new TeamItem("Atlanta Braves", R.drawable.badge_braves));
        baseball.add(new TeamItem("Los Angeles Angels", R.drawable.badge_angels));
        baseball.add(new TeamItem("Miami Marlins", R.drawable.badge_marlins));
        baseball.add(new TeamItem("Boston Red Sox", R.drawable.badge_red_sox));
        baseball.add(new TeamItem("Chicago White Sox", R.drawable.badge_white_sox));
        baseball.add(new TeamItem("Tampa Bay Rays", R.drawable.badge_rays));
        baseball.add(new TeamItem("Kansas City Royals", R.drawable.badge_royals));
        baseball.add(new TeamItem("Los Angeles Dodgers", R.drawable.badge_dodgers));
        baseball.add(new TeamItem("Minnesota Twins", R.drawable.badge_twins));
        baseball.add(new TeamItem("Colorado Rockies", R.drawable.badge_rockies));

        ListView baseballListview = findViewById(R.id.baseball_listview);
        TeamAdapter basketballAdapter = new TeamAdapter(this, baseball);
        baseballListview.setAdapter(basketballAdapter);
    }
}
