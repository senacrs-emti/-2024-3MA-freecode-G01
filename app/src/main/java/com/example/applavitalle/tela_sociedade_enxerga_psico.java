package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class tela_sociedade_enxerga_psico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sociedade_enxerga_psico);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        TextView textituloSO = findViewById(R.id.textituloSO);
        TextView textSO = findViewById(R.id.textaSO);

        ImageButton botaovoltar = findViewById(R.id.botaovoltar);
        botaovoltar.setOnClickListener(v -> {
                        // Abrir activity
                        Intent intent = new Intent(tela_sociedade_enxerga_psico.this, MainActivity.class);
                        startActivity(intent);
            v.animate()
                    .scaleX(0.95f)
                    .scaleY(0.95f)
                    .setDuration(100)
                    .withEndAction(() -> {
                        v.animate()
                                .scaleX(1f)
                                .scaleY(1f)
                                .setDuration(100)
                                .start();
                        // Função a ser inserida do menu
                    })
                    .start();
        });
    }
}