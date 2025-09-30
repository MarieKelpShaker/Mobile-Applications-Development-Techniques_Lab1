package com.example.lab1_again

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.graphics.toColorInt

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(
                systemBars.left,
                systemBars.top,
                systemBars.right,
                systemBars.bottom
            )
            insets
        }

        val mainTV: TextView = findViewById(R.id.mainTextView)
        val btnChangeText: Button = findViewById(R.id.changeTextButton)
        btnChangeText.setOnClickListener {
            mainTV.text = "miau miau!"
        }

        val btnChangeTextColour: Button = findViewById(R.id.changeTextColourButton)
        btnChangeTextColour.setOnClickListener {
            mainTV.setTextColor(Color.RED)
        }

        val rootLayout: ConstraintLayout = findViewById(R.id.main)
        val btnChangeBgColour: Button = findViewById(R.id.bgColourChangeButton)
        btnChangeBgColour.setOnClickListener {
            rootLayout.setBackgroundColor("#a3d3ff".toColorInt())
        }
    }
}

//code