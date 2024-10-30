    package com.example.applavitalle;

    import androidx.appcompat.app.AppCompatActivity;
    import android.content.Intent;
    import android.os.Bundle;
    import android.widget.ImageButton;

    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            setupButtonClickListener(R.id.card1);
            setupButtonClickListener(R.id.card2);
            setupButtonClickListener(R.id.card3);
            setupButtonClickListener(R.id.card4);
            setupButtonClickListener(R.id.card5);
            setupButtonClickListener(R.id.card6);

        }


            // card1
            private void setupButtonClickListener(int buttonId) {
                ImageButton btnMENU = findViewById(R.id.btn_MENU);
                btnMENU.setOnClickListener(v -> {
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
            ImageButton card1 = findViewById(R.id.card1);
            card1.setOnClickListener(v -> {
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
                            // Abrir activity
                            Intent intent = new Intent(MainActivity.this, tela_tiposdeterapia.class);
                            startActivity(intent);
                        })
                        .start();
            });
            // card2
            ImageButton card2 = findViewById(R.id.card2);
            card2.setOnClickListener(v -> {
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
                            // Abrir activity
                            Intent intent = new Intent(MainActivity.this, tela_psicocotidiano.class);
                            startActivity(intent);
                        })
                        .start();
            });
            // card3
            ImageButton card3 = findViewById(R.id.card3);
            card3.setOnClickListener(v -> {
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
                            // Abrir activity
                            Intent intent = new Intent(MainActivity.this, tela_porquedevemos.class);
                            startActivity(intent);
                        })
                        .start();
            });
            // card4
            ImageButton card4 = findViewById(R.id.card4);
            card4.setOnClickListener(v -> {
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
                            // Abrir activity
                            Intent intent = new Intent(MainActivity.this, tela_sociedade_enxerga_psico.class);
                            startActivity(intent);
                        })
                        .start();
            });
            // card5
            ImageButton card5 = findViewById(R.id.card5);
            card5.setOnClickListener(v -> {
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
                            // Abrir activity
                            Intent intent = new Intent(MainActivity.this, tela_duvidas.class);
                            startActivity(intent);
                        })
                        .start();
            });
            // card6
            ImageButton card6 = findViewById(R.id.card6);
            card6.setOnClickListener(v -> {
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
                            // Abrir activity
                            Intent intent = new Intent(MainActivity.this, tela_ajuda.class);
                            startActivity(intent);
                        })
                        .start();
            });
        }
    }
