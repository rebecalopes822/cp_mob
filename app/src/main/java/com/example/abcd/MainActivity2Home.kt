package com.example.abcd

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity2Home : AppCompatActivity() {

    private lateinit var telaResumo: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_activity2_home)


        telaResumo = findViewById(R.id.btnResumo)

        telaResumo.setOnClickListener {
            val telaSeguinte = Intent(this, MainActivityResumo::class.java)
            startActivity(telaSeguinte)
        }
    }
}