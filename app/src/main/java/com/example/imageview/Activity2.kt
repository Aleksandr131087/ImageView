package com.example.imageview

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {

    private lateinit var buttonNext: Button
    private lateinit var imageView: ImageView
    private val photos = arrayOf(R.drawable.photo1, R.drawable.photo2, R.drawable.photo3, R.drawable.photo4, R.drawable.photo5)
    private var PhotoIndex = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        buttonNext = findViewById(R.id.NextBTN)
        imageView = findViewById(R.id.ImageView)
        imageView.setImageResource(photos[PhotoIndex])


        buttonNext.setOnClickListener {
            PhotoIndex++
            if (PhotoIndex >= photos.size) {
                val intent = Intent(this, Activity3::class.java)
                startActivity(intent)
                finish()
            } else {
                imageView.setImageResource(photos[PhotoIndex])
        }
    }
}
}