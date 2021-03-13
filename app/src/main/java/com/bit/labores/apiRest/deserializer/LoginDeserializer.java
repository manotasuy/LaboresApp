package com.bit.labores.apiRest.deserializer;

import android.util.Log;

import com.bit.labores.apiRest.model.AnuncioResponse;
import com.bit.labores.apiRest.model.JsonKeys;
import com.bit.labores.apiRest.model.LoginResponse;
import com.bit.labores.entities.Anuncio;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class LoginDeserializer implements JsonDeserializer<LoginResponse> {

    @Override
    public LoginResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        LoginResponse respuesta = gson.fromJson(json, LoginResponse.class);
        JsonObject jsonObject = json.getAsJsonObject().getAsJsonObject();
        Log.d("Login", jsonObject.toString());
        respuesta.setUser_id(jsonObject.get(JsonKeys.USER_ID).getAsString());
        respuesta.setMessage(jsonObject.get(JsonKeys.MESSAGE).getAsString());
        respuesta.setPassword(jsonObject.get(JsonKeys.PASS).getAsString());
        respuesta.setTipo(jsonObject.get(JsonKeys.TIPO).getAsString());
        respuesta.setUser(jsonObject.get(JsonKeys.USER).getAsString());
        return respuesta;
    }
}
