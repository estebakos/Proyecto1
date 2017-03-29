package com.salidas.proyecto1.model;

/**
 * Created by esteban on 27/03/17.
 */

public class Team {

    private String name;
    private String principalColor;
    private String secondaryColor;
    private int championships;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrincipalColor() {
        return principalColor;
    }

    public void setPrincipalColor(String principalColor) {
        this.principalColor = principalColor;
    }

    public String getSecondaryColor() {
        return secondaryColor;
    }

    public void setSecondaryColor(String secondaryColor) {
        this.secondaryColor = secondaryColor;
    }

    public int getChampionships() {
        return championships;
    }

    public void setChampionships(int championships) {
        this.championships = championships;
    }
}
