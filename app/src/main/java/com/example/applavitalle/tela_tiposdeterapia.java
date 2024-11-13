package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class tela_tiposdeterapia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_tiposdeterapia);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
        TextView textituloTP2 = findViewById(R.id.textituloTP2);
        TextView textTP2 = findViewById(R.id.textTP2);
        TextView textTP3 = findViewById(R.id.textTP3);
        TextView textSUBTP3 = findViewById(R.id.textSUBTP3);
        TextView textTP4 = findViewById(R.id.textTP4);
        TextView textSUBTP4 = findViewById(R.id.textSUBTP4);
        TextView textTP5 = findViewById(R.id.textTP5);
        TextView textSUBTP5 = findViewById(R.id.textSUBTP5);
        TextView textTP6 = findViewById(R.id.textTP6);

        ImageButton botaovoltar = findViewById(R.id.botaovoltar);
        botaovoltar.setOnClickListener(v -> {
            // Abrir activity
            Intent intent = new Intent(tela_tiposdeterapia.this, MainActivity.class);
            startActivity(intent);
        });
    }
}