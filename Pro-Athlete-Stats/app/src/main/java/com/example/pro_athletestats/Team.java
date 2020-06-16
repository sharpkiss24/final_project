package com.example.pro_athletestats;

public class Team {
    private String name;
    private int logo;

    public Team(String name, int logo) {
        this.name = name;
        this.logo = logo;
    }

    public String getName() {
        return name;
    }

    public int getLogo() {
        return logo;
    }

}
