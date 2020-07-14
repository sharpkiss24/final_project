package com.example.pro_athletestats;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class SoccerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soccer);

        ArrayList<TeamItem> soccer = new ArrayList<>();
        soccer.add(new TeamItem("Real Madrid", R.drawable.badge_real_madrid));
        soccer.add(new TeamItem("Barcelona", R.drawable.badge_barcelona));
        soccer.add(new TeamItem("Arsenal", R.drawable.badge_arsenal));
        soccer.add(new TeamItem("Chelsea", R.drawable.badge_chelsea));
        soccer.add(new TeamItem("Liverpool", R.drawable.badge_liverpool));
        soccer.add(new TeamItem("Manchester City", R.drawable.badge_manchester_city));
        soccer.add(new TeamItem("Manchester United", R.drawable.badge_manchester_united));
        soccer.add(new TeamItem("Tottenham Hotspur", R.drawable.badge_tottenham_hotspur));
        soccer.add(new TeamItem("Atletico Madrid", R.drawable.badge_atletico_madrid));
        soccer.add(new TeamItem("Bayern Munich", R.drawable.badge_bayern_munich));
        soccer.add(new TeamItem("Borussia Dortmund", R.drawable.badge_borussia_dortmund));
        soccer.add(new TeamItem("Juventus", R.drawable.badge_juventus));
        soccer.add(new TeamItem("Paris St-Germain", R.drawable.badge_paris_st_germain));

        ListView soccerListview = findViewById(R.id.soccer_listview);
        TeamAdapter soccerAdapter = new TeamAdapter(this, soccer);
        soccerListview.setAdapter(soccerAdapter);
    }
}
