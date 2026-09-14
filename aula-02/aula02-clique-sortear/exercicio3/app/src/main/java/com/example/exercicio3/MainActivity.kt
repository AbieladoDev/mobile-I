package com.example.exercicio3

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

    fun sortear(view: View) {
        val numero = Random().nextInt(11)

        val txtNumero = findViewById<TextView>(R.id.txtNumero)
        txtNumero.text = numero.toString()

        if (numero % 2 == 0) {
            println("número par sorteado: " + numero)
        } else {
            println("número ímpar sorteado: " + numero)
        }
    }
}
