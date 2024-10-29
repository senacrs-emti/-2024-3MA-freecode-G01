package com.example.applavitalle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class tela_duvidas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_duvidas);

        TextView textTITULO = findViewById(R.id.textTITULO);
        TextView textSUB1 = findViewById(R.id.textSUB1);
        TextView text1 = findViewById(R.id.text1);
        TextView textSUB2 = findViewById(R.id.textSUB2);
        TextView textdois = findViewById(R.id.textdois);
        TextView textSUB3 = findViewById(R.id.text3);
        TextView text3 = findViewById(R.id.text3);
    }
}