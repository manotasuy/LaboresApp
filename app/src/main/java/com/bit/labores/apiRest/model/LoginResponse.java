package com.bit.labores.apiRest.model;

public class LoginResponse {

    private int user_id;
    private String user;
    boolean logueado;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean login(String user, String pass) {
        return logueado;
    }
}
