package com.bit.labores.apiRest.model;

public class LoginResponse {

    private String id;
    private String message;
    private String password;
    private String tipo;
    private String user;

    public String getUser_id() {
        return id;
    }

    public void setUser_id(String user_id) {
        this.id = user_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

}
