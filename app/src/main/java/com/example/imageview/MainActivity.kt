package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private lateinit var buttonStart: Button
    private lateinit var nameText: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

buttonStart = findViewById(R.id.StartBTN)
        nameText = findViewById(R.id.NameText)

buttonStart.setOnClickListener{
    val intent = Intent(this, Activity2::class.java )
startActivity(intent)
}

    }
}