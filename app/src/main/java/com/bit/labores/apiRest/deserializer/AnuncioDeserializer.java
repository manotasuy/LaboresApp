package com.bit.labores.apiRest.deserializer;

import com.bit.labores.apiRest.model.JsonKeys;
import com.bit.labores.apiRest.model.AnuncioResponse;
import com.bit.labores.entities.Anuncio;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class AnuncioDeserializer implements JsonDeserializer<AnuncioResponse> {

    @Override
    public AnuncioResponse deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Gson gson = new Gson();
        AnuncioResponse respuesta = gson.fromJson(json, AnuncioResponse.class);
        JsonArray anuncioData = json.getAsJsonObject().getAsJsonArray(JsonKeys.ANUNCIO_RESPONSE_ARRAY);
        respuesta.setAnuncios(this.deserializarDataJson(anuncioData));
        return respuesta;
    }

    private ArrayList<Anuncio> deserializarDataJson(JsonArray data){
        ArrayList<Anuncio> anuncios = new ArrayList<>();
        for(JsonElement elemento : data){
            JsonObject media = elemento.getAsJsonObject();
            int id = media.get(JsonKeys.ANUNCIO_ID).getAsInt();
            String titulo = media.get(JsonKeys.ANUNCIO_TITULO).getAsString();
            String descripcion = media.get(JsonKeys.ANUNCIO_DESCRIPCION).getAsString();
            int pago_hora = media.get(JsonKeys.ANUNCIO_PAGOHORA).getAsInt();

            Anuncio anuncioDesdeJson = new Anuncio();
            anuncioDesdeJson.setId_anuncio(id);
            anuncioDesdeJson.setTitulo(titulo);
            anuncioDesdeJson.setDescripcion(descripcion);
            anuncioDesdeJson.setPago_hora(pago_hora);
            anuncios.add(anuncioDesdeJson);
        }
        return anuncios;
    }
}
