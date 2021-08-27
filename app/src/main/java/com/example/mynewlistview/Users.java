package com.example.mynewlistview;

public class Users {
    String username;
    String useraddress;

    public Users(String username, String useraddress) {
        this.username = username;
        this.useraddress = useraddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }
}
