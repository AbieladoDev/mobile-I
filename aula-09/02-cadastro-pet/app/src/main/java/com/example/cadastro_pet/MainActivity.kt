package com.example.cadastro_pet

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nomePet = findViewById<TextInputEditText>(R.id.etxtNomePet)
        val especie = findViewById<TextInputEditText>(R.id.etxtEspecie)
        val idadePet = findViewById<TextInputEditText>(R.id.etxtIdadePet)
        val botao = findViewById<Button>(R.id.btn_CadastrarPet)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val nome = nomePet.text.toString()
            val especieAnimal = especie.text.toString()
            val idade = idadePet.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("Nome: $nome")
            println("Espécie: $especieAnimal")
            println("Idade: $idade anos")

            // Desafio: mostrar na tela
            resultado.text = "$nome ($especieAnimal), $idade anos, cadastrado com sucesso!"
        }
    }
}
