package com.example.tela_login

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
        val senha = findViewById<TextInputEditText>(R.id.etxtSenha)
        val botao = findViewById<Button>(R.id.btn_Entrar)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val emailUsuario = email.text.toString()
            val senhaUsuario = senha.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("E-mail digitado: $emailUsuario")
            println("Senha com ${senhaUsuario.length} caracteres")

            // Regra extra: a senha precisa ter no mínimo 6 caracteres
            val mensagem: String
            if (senhaUsuario.length < 6) {
                mensagem = "Senha muito curta! Mínimo 6 caracteres."
                println(mensagem)
            } else {
                println("Login realizado: $emailUsuario")
                mensagem = "Bem-vindo(a), $emailUsuario!"
            }

            // Desafio: mostrar na tela
            resultado.text = mensagem
        }
    }
}
