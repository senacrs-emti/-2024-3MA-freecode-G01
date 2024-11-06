package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

public class tela_psicocotidiano extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_psicocotidiano);

        ImageButton botaovoltar = findViewById(R.id.botaovoltar);
        botaovoltar.setOnClickListener(v -> {
            // Abrir activity
            Intent intent = new Intent(tela_psicocotidiano.this, MainActivity.class);
            startActivity(intent);
        });
    }
}