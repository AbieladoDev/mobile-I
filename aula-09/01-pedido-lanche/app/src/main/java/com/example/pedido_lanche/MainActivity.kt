package com.example.pedido_lanche

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lanche = findViewById<TextInputEditText>(R.id.etxtLanche)
        val bebida = findViewById<TextInputEditText>(R.id.etxtBebida)
        val observacao = findViewById<TextInputEditText>(R.id.etxtObservacao)
        val botao = findViewById<Button>(R.id.btn_Pedir)
        val resultado = findViewById<TextView>(R.id.txtResultado)

        botao.setOnClickListener {
            val lancheEscolhido = lanche.text.toString()
            val bebidaEscolhida = bebida.text.toString()
            val observacaoPedido = observacao.text.toString()

            // Etapa 1: mostrar no terminal (Logcat)
            println("Lanche: $lancheEscolhido")
            println("Bebida: $bebidaEscolhida")
            println("Observação: $observacaoPedido")

            // Desafio: mostrar na tela
            resultado.text = "Pedido: $lancheEscolhido + $bebidaEscolhida ($observacaoPedido)"
        }
    }
}
