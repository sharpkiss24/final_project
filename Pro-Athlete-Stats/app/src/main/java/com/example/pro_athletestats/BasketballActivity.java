package com.example.pro_athletestats;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class BasketballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basketball);

        ArrayList<TeamItem> basketball = new ArrayList<>();
        basketball.add(new TeamItem("Los Angeles Lakers", R.drawable.badge_lakers));
        basketball.add(new TeamItem("Milwaukee Bucks", R.drawable.badge_bucks));
        basketball.add(new TeamItem("Toronto Raptors", R.drawable.badge_raptors));
        basketball.add(new TeamItem("Boston Celtics", R.drawable.badge_celtics));
        basketball.add(new TeamItem("Houston Rockets", R.drawable.badge_rockets));
        basketball.add(new TeamItem("Miami Heat", R.drawable.badge_heat));
        basketball.add(new TeamItem("Oklahoma City Thunder", R.drawable.badge_thunder));
        basketball.add(new TeamItem("Brooklyn Nets", R.drawable.badge_nets));
        basketball.add(new TeamItem("San Antonio Spurs", R.drawable.badge_spurs));
        basketball.add(new TeamItem("Chicago Bulls", R.drawable.badge_bulls));
        basketball.add(new TeamItem("Golden State Warriors", R.drawable.badge_warriors));
        basketball.add(new TeamItem("Cleaveland Cavaliers", R.drawable.badge_cavs));

        ListView basketballListview = findViewById(R.id.basketball_listview);
        TeamAdapter basketballAdapter = new TeamAdapter(this, basketball);
        basketballListview.setAdapter(basketballAdapter);

    }
}

