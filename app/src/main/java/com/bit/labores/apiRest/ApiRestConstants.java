package com.bit.labores.apiRest;

public class ApiRestConstants {

    public ApiRestConstants(){}

    public static final String USER_ID = "";
    public static final String ACCESS_TOKEN = "";
    public static final String VERSION = "/v1.0/";
    public static final String ROOT_URL = "http://labores2021.pythonanywhere.com/" + VERSION;
    public static final String KEY_ACCESS_TOKEN = "&access_token=";
    public static final String FULL_TOKEN = KEY_ACCESS_TOKEN + ACCESS_TOKEN;
    public static final String KEY_ANUNCIO = "/anuncio?fields=id,etc.";
    public static final String URL_ANUNCIO = USER_ID + KEY_ANUNCIO + FULL_TOKEN;

    public static final String KEY_LOGIN = "/login?user=";
    public static final String URL_LOGIN = "";

    public String getUrlAnuncio() {
        return URL_ANUNCIO;
    }

    public String getUrlLogin() {
        return URL_LOGIN;
    }
}