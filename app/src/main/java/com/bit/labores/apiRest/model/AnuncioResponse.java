package com.bit.labores.apiRest.model;

import java.util.ArrayList;
import com.bit.labores.entities.Anuncio;

public class AnuncioResponse {

    ArrayList<Anuncio> anuncios;

    public ArrayList<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(ArrayList<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }
}
