package com.example.s3briceo_ordenamientoburbuja

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.widget.TextView;
import android.widget.EditText;
import android.widget.Button;

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val valA = findViewById<EditText>(R.id.etValorA)
        val valB = findViewById<EditText>(R.id.etValorB)
        val valC = findViewById<EditText>(R.id.etValorC)
        val valD = findViewById<EditText>(R.id.etValorD)
        val valE = findViewById<EditText>(R.id.etValorE)

        val btnMenorMayor = findViewById<Button>(R.id.btnOrdenarMenorMayor)
        val btnMayorMenor = findViewById<Button>(R.id.btnOrdenarMayorMenor)

        val tvRest = findViewById<TextView>(R.id.tvResultado)

        btnMenorMayor.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()
            val c = valC.text.toString().trim()
            val d = valD.text.toString().trim()
            val e = valE.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty() && d.isNotEmpty() && e.isNotEmpty()) {
                val valores = intArrayOf(a.toInt(), b.toInt(), c.toInt(), d.toInt(), e.toInt())
                val n = valores.size

                for (i in 0 until n - 1) {
                    for (j in 0 until n - i - 1) {
                        if (valores[j] > valores[j + 1]) {
                            val temp = valores[j]
                            valores[j] = valores[j + 1]
                            valores[j + 1] = temp
                        }
                    }
                }
                tvRest.text = "Ordenado de Menor a Mayor: ${valores.joinToString(", ")}"
            }
        }

        btnMayorMenor.setOnClickListener {
            val a = valA.text.toString().trim()
            val b = valB.text.toString().trim()
            val c = valC.text.toString().trim()
            val d = valD.text.toString().trim()
            val e = valE.text.toString().trim()

            if (a.isNotEmpty() && b.isNotEmpty() && c.isNotEmpty() && d.isNotEmpty() && e.isNotEmpty()) {
                val valores = intArrayOf(a.toInt(), b.toInt(), c.toInt(), d.toInt(), e.toInt())
                val n = valores.size

                for (i in 0 until n - 1) {
                    for (j in 0 until n - i - 1) {
                        if (valores[j] < valores[j + 1]) {
                            val temp = valores[j]
                            valores[j] = valores[j + 1]
                            valores[j + 1] = temp
                        }
                    }
                }
                tvRest.text = "Ordenado de Mayor a Menor: ${valores.joinToString(", ")}"
            }
        }

    }
}