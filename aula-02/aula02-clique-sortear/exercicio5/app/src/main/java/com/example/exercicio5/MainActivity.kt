package com.example.exercicio5

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun clique(view: View) {
        println("o botão de aviso foi clicado")
    }

    fun sortear(view: View) {
        val numero = Random().nextInt(11)
        val txtNumero = findViewById<TextView>(R.id.txtNumero)
        txtNumero.text = numero.toString()
    }

    fun avisarESortear(view: View) {
        println("o botão ambos foi clicado")

        val numero = Random().nextInt(11)
        val txtNumero = findViewById<TextView>(R.id.txtNumero)
        txtNumero.text = numero.toString()
    }
}
