package com.bit.labores.apiRest;

import com.bit.labores.apiRest.model.AnuncioResponse;
import com.bit.labores.apiRest.model.LoginResponse;
import com.bit.labores.apiRest.model.LoginRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IApiEndpoints {

    @GET(ApiRestConstants.URL_ANUNCIO)
    Call<AnuncioResponse> getAnuncios();

    @POST(".")
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);
}
