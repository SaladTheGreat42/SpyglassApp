package com.example.spyglassapp;

//The Backend is based on a video that goes over SQLlite for Android Studio
public class CustomerModel {
    private int id;
    private String UserName;
    private String Password;
    private boolean isActive;

    public CustomerModel(int id, String userName, String password, boolean isActive) {
        this.id = id;
        UserName = userName;
        Password = password;
        this.isActive = isActive;
    }

    public CustomerModel(){
    }

    @Override
    public String toString() {
        return "CustomerModel{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", Password='" + Password + '\'' +
                ", isActive=" + isActive +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
