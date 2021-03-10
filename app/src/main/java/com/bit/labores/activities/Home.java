package com.bit.labores.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.os.Bundle;
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
}