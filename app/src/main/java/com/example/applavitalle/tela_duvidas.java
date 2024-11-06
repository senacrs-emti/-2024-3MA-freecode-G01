package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class tela_duvidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_duvidas);

        ImageButton botaovoltar = findViewById(R.id.botaovoltar);
        botaovoltar.setOnClickListener(v -> {
            // Abrir activity
            Intent intent = new Intent(tela_duvidas.this, MainActivity.class);
            startActivity(intent);
        });

        TextView textituloD = findViewById(R.id.textituloD);
        TextView textSUB1 = findViewById(R.id.textSUB1);
        TextView textD1 = findViewById(R.id.textD1);
        TextView textSUB2 = findViewById(R.id.textSUB2);
        TextView textD2 = findViewById(R.id.textD2);
        TextView textSUB3 = findViewById(R.id.textSUB3);
        TextView textD3 = findViewById(R.id.textD3);

    }
}