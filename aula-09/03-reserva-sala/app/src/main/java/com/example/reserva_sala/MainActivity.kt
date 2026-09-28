package com.example.reserva_sala

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nome = findViewById<TextInputEditText>(R.id.etxtNome)
        val sala = findViewById<TextInputEditText>(R.id.etxtSala)
        val horario = findViewById<TextInputEditText>(R.id.etxtHorario)
        val botao = findViewById<Button>(R.id.btn_Reservar)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val responsavel = nome.text.toString()
            val salaEscolhida = sala.text.toString()
            val horarioEscolhido = horario.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("Responsável: $responsavel")
            println("Sala: $salaEscolhida")
            println("Horário: $horarioEscolhido")

            // Desafio: mostrar na tela
            resultado.text = "$salaEscolhida reservado para $responsavel às $horarioEscolhido"
        }
    }
}
