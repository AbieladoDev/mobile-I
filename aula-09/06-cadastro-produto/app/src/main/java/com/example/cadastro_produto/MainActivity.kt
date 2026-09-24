package com.example.cadastro_produto

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val produto = findViewById<TextInputEditText>(R.id.etxtProduto)
        val preco = findViewById<TextInputEditText>(R.id.etxtPreco)
        val quantidade = findViewById<TextInputEditText>(R.id.etxtQuantidade)
        val botao = findViewById<Button>(R.id.btn_Cadastrar)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val nomeProduto = produto.text.toString()
            val precoDigitado = preco.text.toString()
            val quantidadeDigitada = quantidade.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("Produto: $nomeProduto")
            println("Preço: R$ $precoDigitado")
            println("Quantidade: $quantidadeDigitada")

            // Regra extra: preço maior que zero
            val mensagem: String
            val valor = precoDigitado.toDoubleOrNull()
            val estoque = quantidadeDigitada.toIntOrNull()
            if (valor != null && valor > 0 && estoque != null) {
                println("Produto cadastrado!")
                mensagem = "$nomeProduto cadastrado! Valor em estoque: R$ ${valor * estoque}"
            } else {
                mensagem = "Preço inválido!"
                println(mensagem)
            }

            // Desafio: mostrar na tela
            resultado.text = mensagem
        }
    }
}
