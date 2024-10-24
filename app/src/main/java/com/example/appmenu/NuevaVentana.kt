package com.example.appmenu

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class NuevaVentana : AppCompatActivity() {

    private lateinit var btnFelicidades: AppCompatButton

    private fun initComponents() {
        btnFelicidades = findViewById(R.id.btnFelicidades)
    }

    private fun initListeners() {
        btnFelicidades.setOnClickListener(){finish()}
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nueva_ventana)
        supportActionBar?.hide()
        initComponents()
        initListeners()
    }
}