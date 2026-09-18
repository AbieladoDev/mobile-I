package com.example.pedra_papel_tesoura;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void selecionarPedra(View view) { verificarGanhador("pedra"); }
    public void selecionarPapel(View view) { verificarGanhador("papel"); }
    public void selecionarTesoura(View view) { verificarGanhador("tesoura"); }

    private String gerarEscolhaAleatoriaApp() {
        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numeroAleatorio = new Random().nextInt(3);
        ImageView imagemInimigo = findViewById(R.id.inimigo);
        String escolhaApp = opcoes[numeroAleatorio];

        switch (escolhaApp) {
            case "pedra": imagemInimigo.setImageResource(R.drawable.pedra); break;
            case "papel": imagemInimigo.setImageResource(R.drawable.papel); break;
            case "tesoura": imagemInimigo.setImageResource(R.drawable.tesoura); break;
        }
        return escolhaApp;
    }

    private void verificarGanhador(String escolhaUsuario) {
        String escolhaApp = gerarEscolhaAleatoriaApp();
        TextView textoResultado = findViewById(R.id.textoResultado);

        if ((escolhaApp.equals("pedra") && escolhaUsuario.equals("tesoura")) ||
                (escolhaApp.equals("papel") && escolhaUsuario.equals("pedra")) ||
                (escolhaApp.equals("tesoura") && escolhaUsuario.equals("papel"))) {
            textoResultado.setText("Você perdeu :(");
        } else if ((escolhaUsuario.equals("pedra") && escolhaApp.equals("tesoura")) ||
                (escolhaUsuario.equals("papel") && escolhaApp.equals("pedra")) ||
                (escolhaUsuario.equals("tesoura") && escolhaApp.equals("papel"))) {
            textoResultado.setText("Você ganhou :)");
        } else {
            textoResultado.setText("Deu empate!!!");
        }
    }
}