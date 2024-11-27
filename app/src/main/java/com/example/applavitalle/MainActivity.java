    package com.example.applavitalle;

    import android.text.method.LinkMovementMethod;
    import android.text.util.Linkify;
    import androidx.appcompat.app.AlertDialog;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.appcompat.app.AppCompatDelegate;

    import android.content.Intent;
    import android.os.Bundle;
    import android.widget.ImageButton;
    import android.widget.TextView;


    public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

            setupButtonClickListener(R.id.card1);
            setupButtonClickListener(R.id.card2);
            setupButtonClickListener(R.id.card3);
            setupButtonClickListener(R.id.card4);
            setupButtonClickListener(R.id.card5);
        }

        // btn menu
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

                            // Cria o TextView com os links
                            TextView textView = new TextView(v.getContext());
                            textView.setText(
                                    "CVV - Atendimento pelo telefone 188 ou pelo site: https://cvv.org.br/" +
                                            "\n\n" +
                                            "CRAS - Atendimento pelo site: https://prefeitura.poa.br/fasc/cras" +
                                            "\n\n" +
                                            "CAPS - Saiba mais pelo site: https://www.gov.br/saude/pt-br/composicao/saes/desmad/raps/caps"
                            );
                            textView.setAutoLinkMask(Linkify.WEB_URLS);
                            textView.setMovementMethod(LinkMovementMethod.getInstance());
                            textView.setPadding(50, 30, 50, 30); // Configura o espaçamento

                            // Cria o AlertDialog com o TextView
                            new AlertDialog.Builder(v.getContext())
                                    .setTitle("Precisa de ajuda?")
                                    .setView(textView)
                                    .setNegativeButton("Fechar", (dialog, which) -> dialog.dismiss())
                                    .show();
                        })
                        .start();
            });
            //  card1
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
            }}