package com.salidas.proyecto1.model;

import java.util.ArrayList;

/**
 * Created by esteban on 27/03/17.
 */

public class Country {

    private String code;
    private String country;
    private String shield;
    private ArrayList<Team> teams = new ArrayList<>();

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getShield() {
        return shield;
    }

    public void setShield(String shield) {
        this.shield = shield;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void setTeams(ArrayList<Team> teams) {
        this.teams = teams;
    }
}
