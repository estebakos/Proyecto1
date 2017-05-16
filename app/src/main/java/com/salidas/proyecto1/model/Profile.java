package com.salidas.proyecto1.model;

import java.util.ArrayList;

/**
 * Created by esteban on 15/05/17.
 */

public class Profile {
    private int id;
    private String name, profilePicture, coverPicture, birthdate, address;
    private ArrayList<Group> favoriteGroups = new ArrayList<>();
    private ArrayList<Friend> friends = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getCoverPicture() {
        return coverPicture;
    }

    public void setCoverPicture(String coverPicture) {
        this.coverPicture = coverPicture;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Group> getFavoriteGroups() {
        return favoriteGroups;
    }

    public void setFavoriteGroups(ArrayList<Group> favoriteGroups) {
        this.favoriteGroups = favoriteGroups;
    }

    public ArrayList<Friend> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<Friend> friends) {
        this.friends = friends;
    }
}
