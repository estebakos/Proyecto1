package com.salidas.proyecto1.model;

/**
 * Created by esteban on 15/05/17.
 */

public class Friend {
    private int idFriend;
    private String nameFriend, profilePicture, addressFriend;

    public int getIdFriend() {
        return idFriend;
    }

    public void setIdFriend(int idFriend) {
        this.idFriend = idFriend;
    }

    public String getNameFriend() {
        return nameFriend;
    }

    public void setNameFriend(String nameFriend) {
        this.nameFriend = nameFriend;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(String profilePicture) {
        this.profilePicture = profilePicture;
    }

    public String getAddressFriend() {
        return addressFriend;
    }

    public void setAddressFriend(String addressFriend) {
        this.addressFriend = addressFriend;
    }
}
