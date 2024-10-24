package com.example.appmenu

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: AppCompatButton
    private lateinit var btn2: AppCompatButton
    private lateinit var btn3: AppCompatButton
    private lateinit var btn4: AppCompatButton
    private lateinit var btn5: AppCompatButton
    private lateinit var tvEfimero: TextView

    private fun initComponents() {
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
        btn3 = findViewById(R.id.btn3)
        btn4 = findViewById(R.id.btn4)
        btn5 = findViewById(R.id.btn5)
        tvEfimero = findViewById(R.id.tvEfimero)
    }

    private fun initListeners() {

        btn1.setOnClickListener {
            abrirNuevaActividad()
        }

        btn2.setOnClickListener {
            Toast.makeText(this, "Soy una tostada", Toast.LENGTH_LONG).show()
        }

        btn3.setOnClickListener {
            Snackbar.make(btn3, "Soy un bar de snacks", Snackbar.LENGTH_SHORT).setAnchorView(btn3)
                .setAction("CIERRAME GUAPO") {}.show()

        }

        btn4.setOnClickListener {
            finishAffinity()
        }

        btn5.setOnClickListener {
            setTextVisibility()
        }

    }

    private fun setTextVisibility() {
        if (tvEfimero.visibility == View.INVISIBLE) {

            tvEfimero.visibility = View.VISIBLE

        } else {

            tvEfimero.visibility = View.INVISIBLE

        }
    }

    private fun abrirNuevaActividad() {
        val intentNUEV: Intent = Intent(this, NuevaVentana::class.java)
        startActivity(intentNUEV)
    }

    private fun initUI() {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        initComponents()
        initListeners()
        initUI()
    }
}