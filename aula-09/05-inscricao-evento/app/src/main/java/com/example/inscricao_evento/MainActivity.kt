package com.example.inscricao_evento

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
        val email = findViewById<TextInputEditText>(R.id.etxtEmail)
        val idade = findViewById<TextInputEditText>(R.id.etxtIdade)
        val botao = findViewById<Button>(R.id.btn_Inscrever)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val nomeParticipante = nome.text.toString()
            val emailParticipante = email.text.toString()
            val idadeDigitada = idade.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("Nome: $nomeParticipante")
            println("E-mail: $emailParticipante")
            println("Idade: $idadeDigitada")

            // Regra extra: idade entre 14 e 99
            val mensagem: String
            val anos = idadeDigitada.toIntOrNull()
            if (anos != null && anos in 14..99) {
                println("Inscrição confirmada!")
                mensagem = "$nomeParticipante, sua inscrição foi confirmada!"
            } else {
                mensagem = "Idade inválida para o evento."
                println(mensagem)
            }

            // Desafio: mostrar na tela
            resultado.text = mensagem
        }
    }
}
