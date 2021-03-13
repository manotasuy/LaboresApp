package com.bit.labores.apiRest;

import com.bit.labores.apiRest.model.AnuncioResponse;
import com.bit.labores.apiRest.model.LoginResponse;
import com.bit.labores.apiRest.model.LoginRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface IApiEndpoints {

    @POST(ApiRestConstants.URL_LOGIN)
    Call<LoginResponse> userLogin(@Body LoginRequest loginRequest);

    @GET(ApiRestConstants.URL_ANUNCIO)
    Call<AnuncioResponse> getAnuncios();
}
