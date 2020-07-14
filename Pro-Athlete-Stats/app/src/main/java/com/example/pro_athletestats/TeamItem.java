package com.example.pro_athletestats;

public class TeamItem {
    private String name;
    private int teamBadge;

    public TeamItem(String name, int teamBadge) {
        this.name = name;
        this.teamBadge = teamBadge;
    }

    public String getName() {
        return name;
    }

    public int getTeamBadge() {
        return teamBadge;
    }
}
