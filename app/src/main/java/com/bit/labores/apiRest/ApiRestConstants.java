package com.bit.labores.apiRest;

public class ApiRestConstants {

    public ApiRestConstants(){}

    public static final String USER_ID = "USER";
    public static final String ACCESS_TOKEN = "TOKEN";
    public static final String VERSION = "/v1.0/";
    public static final String KEY_ACCESS_TOKEN = "&access_token=";
    public static final String FULL_TOKEN = KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    public static final String ROOT_URL = "http://labores2021.pythonanywhere.com//api/";

    public static final String KEY_LOGIN = "Ingresar/";
    public static final String URL_LOGIN = KEY_LOGIN + "";

    public static final String KEY_ANUNCIO = "/anuncio?fields=id,etc.";
    public static final String URL_ANUNCIO = KEY_ANUNCIO + "";

    public String getUrlAnuncio() {
        return URL_ANUNCIO;
    }

    public String getUrlLogin() {
        return URL_LOGIN;
    }
}