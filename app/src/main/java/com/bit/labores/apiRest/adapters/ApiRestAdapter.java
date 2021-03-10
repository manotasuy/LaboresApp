package com.bit.labores.apiRest.adapters;

import com.bit.labores.apiRest.ApiRestConstants;
import com.bit.labores.apiRest.IApiEndpoints;
import com.bit.labores.apiRest.deserializer.AnuncioDeserializer;
import com.bit.labores.apiRest.deserializer.LoginDeserializer;
import com.bit.labores.apiRest.model.AnuncioResponse;
import com.bit.labores.apiRest.model.LoginResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRestAdapter {

    public IApiEndpoints establecerConexionApiLabores(Gson gson) {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiRestConstants.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
        return retrofit.create(IApiEndpoints.class);
    }

    public Gson construyeGsonDeserializadorAnuncios() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(AnuncioResponse.class, new AnuncioDeserializer());
        return gsonBuilder.create();
    }

    public Gson construyeGsonDeserializadorLogin() {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LoginResponse.class, new LoginDeserializer());
        return gsonBuilder.create();
    }
}
