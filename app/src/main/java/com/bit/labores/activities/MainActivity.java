package com.bit.labores.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.bit.labores.R;
import com.bit.labores.apiRest.IApiEndpoints;
import com.bit.labores.tools.SharedPreferencesHandler;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import com.bit.labores.apiRest.adapters.ApiRestAdapter;
import com.bit.labores.apiRest.model.LoginRequest;
import com.bit.labores.apiRest.model.LoginResponse;
import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarComponentes();

        // Si ya está logueado debe redirigir al Home
        if (estaLogueado()){
            Intent i = new Intent(this, Home.class);
            startActivity(i);
        }
    }

    private void cargarComponentes() {
        // Cargo el ActionBar
        Toolbar abApp = findViewById(R.id.ab_app);
        setSupportActionBar(abApp);
    }

    public void login(View v) {
        // Si el logueo fue exitoso debe redirigir al Home
        // Debo autenticar a través de la API
        if (autenticarDesdeApi()) {
            Intent i = new Intent(this, Home.class);
            startActivity(i);
        }
    }

    private boolean autenticarDesdeApi() {

//        String usuario = ((EditText) findViewById(R.id.etUsuario)).getText().toString();
//        String clave = ((EditText) findViewById(R.id.etClave)).getText().toString();
//        LoginRequest loginRequest = new LoginRequest();
//        loginRequest.setUser(usuario);
//        loginRequest.setPass(clave);
//
//        ApiRestAdapter adaptador = new ApiRestAdapter();
//        Gson gsonLoginInfo = adaptador.construyeGsonDeserializadorLogin();
//        IApiEndpoints endpointsAPI = adaptador.establecerConexionApiLabores(gsonLoginInfo);
//        Call<LoginResponse> loginResponseCall = endpointsAPI.userLogin(loginRequest);
//        loginResponseCall.enqueue(new Callback<LoginResponse>() {
//            @Override
//            public void onResponse(Call<LoginResponse> call, Response<LoginResponse> response) {
//
//                if(response.isSuccessful()){
//                    Toast.makeText(MainActivity.this,"Login Successful", Toast.LENGTH_LONG).show();
//                    LoginResponse loginResponse = response.body();
//                    guardarCuenta(usuario,clave);
//                }
//                else{
//                    Toast.makeText(MainActivity.this,"Login Failed", Toast.LENGTH_LONG).show();
//                }
//            }
//            @Override
//            public void onFailure(Call<LoginResponse> call, Throwable t) {
//                Toast.makeText(MainActivity.this, "Connection failed", Toast.LENGTH_LONG).show();
//                Log.e("Connection failed", t.toString());
//            }
//        });
        return true;
    }

    public void registro(View v) {
        // Debe redirigirse a la actividad de registro
        Intent i = new Intent(this, Register.class);
        startActivity(i);
    }

    public void recuperar_clave(View v) {
        // Debe redirigirse a la actividad de recuperación de clave
        Intent i = new Intent(this, PasswordRecovery.class);
        startActivity(i);
    }

    private boolean estaLogueado() {
        // Debe consultar a las preferencias compartidas para ver si están las credenciales guardadas,
        // en caso afirmativo es porque el usuario se logueo, sino no
        String usuario = (String) SharedPreferencesHandler.obtenerPreferencia(this, "usuario", "string");
        String clave = (String) SharedPreferencesHandler.obtenerPreferencia(this, "clave", "string");
        return usuario != "" && clave != "";
    }

    private void guardarCuenta(String usuario, String clave) {
        try {
            // Guardo el usuario y clave en las preferencias compartidas
            SharedPreferencesHandler.guardarPreferencia(this,"usuario", usuario, "string");
            SharedPreferencesHandler.guardarPreferencia(this,"clave", clave, "string");
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            // Lo que se deba hacer si corresponde
        }
    }
}