package com.example.exercicio4

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Random

class MainActivity : AppCompatActivity() {

    var rolagens = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun rolarDado(view: View) {
        val resultado = Random().nextInt(6) + 1
        rolagens = rolagens + 1

        val txtDado = findViewById<TextView>(R.id.txtDado)
        txtDado.text = "Rolagem " + rolagens + ": resultado " + resultado

        println("rolagem " + rolagens + " - saiu " + resultado)
    }
}
