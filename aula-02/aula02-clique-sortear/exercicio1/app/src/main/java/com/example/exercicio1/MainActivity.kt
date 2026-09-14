package com.example.exercicio1

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun saudarUsuario(view: View) {
        println("botao saudar foi clicado")

        val txtSaudacao = findViewById<TextView>(R.id.txtSaudacao)
        txtSaudacao.text = "Olá, seja bem-vindo(a)!"
    }
}
