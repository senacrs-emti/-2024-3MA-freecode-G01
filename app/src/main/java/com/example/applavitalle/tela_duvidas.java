package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

public class tela_duvidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_duvidas);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        TextView textituloD = findViewById(R.id.textituloD);
        TextView textSUB1 = findViewById(R.id.textSUB1);
        TextView textD1 = findViewById(R.id.textD1);
        TextView textSUB2 = findViewById(R.id.textSUB2);
        TextView textD2 = findViewById(R.id.textD2);
        TextView textSUB3 = findViewById(R.id.textSUB3);
        TextView textD3 = findViewById(R.id.textD3);

        ImageButton botaovoltar = findViewById(R.id.botaovoltar);
        botaovoltar.setOnClickListener(v -> {
            // Abrir activity
            Intent intent = new Intent(tela_duvidas.this, MainActivity.class);
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
                    })
                    .start();
        });
    }
}