package com.marcioposgraduacao.marcaestrela

import android.os.Bundle
import android.view.inputmethod.InputBinding
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var imagem: ImageView
    private lateinit var btOnOff: Button

    private var isChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        imagem = findViewById(R.id.imagem)
        btOnOff = findViewById(R.id.btOnOff)

        btOnOff.setOnClickListener {
            btOnOffOnClick()

        }
    }

    private fun btOnOffOnClick() {
        // Poderia ter utilizado o if e else para o status da estrela.
        when (isChecked) {
            false -> {
                imagem.setImageResource(android.R.drawable.btn_star_big_on)
                isChecked = true
            }
            true -> {
                imagem.setImageResource(android.R.drawable.btn_star_big_off)
                isChecked = false
            }

        }

    }

} // fim da MainActivity
