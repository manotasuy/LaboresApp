package com.bit.labores.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.bit.labores.R;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        cargarComponentes();
    }

    private void cargarComponentes() {
        // Cargo el ActionBar
        Toolbar abApp = findViewById(R.id.ab_app);
        setSupportActionBar(abApp);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Se sobreescribe el método para poder utilizar el menú custom creado
        //return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Se sobreescribe el método para poder hacer las acciones sobre nuestro menú
        // Debo mantener las opciones padre sino pierdo el "subir nivel"
        //return super.onOptionsItemSelected(item);
        Intent i;
        switch (item.getItemId()) {
            case R.id.menuHome:
                i = new Intent(this, Home.class);
                startActivity(i);
                return true;
            case R.id.menuAnuncios:
                i = new Intent(this, AnunciosDisponiblesEmpleado.class);
                startActivity(i);
                return true;
            case R.id.menuPostulaciones:
                i = new Intent(this, PostulacionesEmpleado.class);
                startActivity(i);
                return true;
            case R.id.menuVinculos:
                i = new Intent(this, VinculosEmpleado.class);
                startActivity(i);
                return true;
            case R.id.menuMensajes:
                i = new Intent(this, MensajesEmpleado.class);
                startActivity(i);
                return true;
            default:
                i = new Intent(this, MainActivity.class);
                startActivity(i);
                return super.onOptionsItemSelected(item);
        }
    }
}