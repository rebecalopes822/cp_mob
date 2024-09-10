package com.example.abcd

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

    Handler(Looper.getMainLooper()).postDelayed({

        val telaHome = Intent(this, MainActivity2Home::class.java)
        startActivity(telaHome)
    }, 3000 )

    }
}