package com.example.myfirstapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        Log.d("MainActivity", "onCreate called")
        val resultTextView1: TextView = findViewById(R.id.resultTextView1)
        val resultTextView2: TextView = findViewById(R.id.resultTextView2)
        val resultTextView3: TextView = findViewById(R.id.resultTextView3)
        val resultTextView4: TextView = findViewById(R.id.resultTextView4)
        val resultTextView5: TextView = findViewById(R.id.resultTextView5)
        button.setOnClickListener{
            Log.d("MainActivity", "Button clicked")
            resultTextView1.text = "Result 1: ${calculateResult1()}"
            resultTextView2.text = "Result 2: ${calculateResult2()}"
            resultTextView3.text = "Result 3: ${calculateResult3()}"
            resultTextView4.text = "Result 4: ${calculateResult4()}"
            resultTextView5.text = "Result 5: ${calculateResult5()}"
        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    // Function for the first equation
    private fun calculateResult1(): Int {
        val a = 10
        val b = 20
        val c = 5
        return ((a + b - c) * 2 / 3) % 5
    }

    // Function for the second equation
    private fun calculateResult2(): Int {
        val a = 10
        val b = 2
        val c = 5
        val d = 3
        return ((a - b) * c) / d + 15 % 4 - (c or d)
    }

    // Function for the third equation
    private fun calculateResult3(): Int {
        val a = 5
        val b = 3
        val c = 2
        val d = 4
        return ((a - b) * c) * d * 2 + a % d - (c * d)
    }

    // Function for the fourth equation
    private fun calculateResult4(): Int {
        val a = 10
        val b = 2
        val c = 5
        val d = 3
        return ((a - 7 * b) * 18 * c) * d - 150 * a - (c % d)
    }

    // Function for the fifth equation
    private fun calculateResult5(): Int {
        val a = 15
        val b = 13
        val c = 5
        val d = 40
        return ((a - b + d) * c) / d * 2 + 18 * (a + d) + (c % d)
    }
}