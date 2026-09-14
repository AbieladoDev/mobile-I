package com.example.exercicio6

import android.graphics.Color
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
            txtNumero.setTextColor(Color.parseColor("#1F7A6C"))
            println("número par sorteado: " + numero + " - cor verde")
        } else {
            txtNumero.setTextColor(Color.parseColor("#B23A48"))
            println("número ímpar sorteado: " + numero + " - cor vermelha")
        }
    }
}
