package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tela_porquedevemos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_porquedevemos);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

        TextView textituloPQ = findViewById(R.id.textituloPQ);
        TextView textPQ = findViewById(R.id.textPQ);

        ImageButton botaovoltar = findViewById(R.id.botaovoltar);
        botaovoltar.setOnClickListener(v -> {
            // Abrir activity
            Intent intent = new Intent(tela_porquedevemos.this, MainActivity.class);
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