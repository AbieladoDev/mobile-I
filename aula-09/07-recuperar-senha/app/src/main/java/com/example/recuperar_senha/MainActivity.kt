package com.example.recuperar_senha

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<TextInputEditText>(R.id.etxtEmail)
        val confirmarEmail = findViewById<TextInputEditText>(R.id.etxtConfirmarEmail)
        val botao = findViewById<Button>(R.id.btn_Recuperar)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val emailUsuario = email.text.toString()
            val confirmacao = confirmarEmail.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("E-mail: $emailUsuario")
            println("Confirmação: $confirmacao")

            // Regra extra: os dois e-mails precisam ser iguais
            val mensagem = if (emailUsuario == confirmacao) {
                "Link enviado para $emailUsuario"
            } else {
                "Os e-mails não conferem!"
            }
            println(mensagem)

            // Desafio: mostrar na tela
            resultado.text = mensagem
        }
    }
}
