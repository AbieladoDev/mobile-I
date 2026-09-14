package com.example.exercicio2

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun contarClique(view: View) {
        contador = contador + 1

        val txtContador = findViewById<TextView>(R.id.txtContador)
        txtContador.text = "Cliques: " + contador

        println("botão clicado " + contador + " vezes")
    }
}
