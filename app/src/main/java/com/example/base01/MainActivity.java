package com.example.base01;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.Menu;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button registro, iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Ocultar la Action Bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


        registro = (Button) findViewById(R.id.notienescuenta);

        iniciar = (Button) findViewById(R.id.iniciarsesion);

        registro.setOnClickListener( v -> {
            Intent intent = new Intent(MainActivity.this, Registro.class);

            startActivity(intent);
        });

        iniciar.setOnClickListener( v -> {
            Intent intent2 = new Intent(MainActivity.this, inicio.class);

            startActivity(intent2);
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return false; // Evita que se infle el menú
    }
}