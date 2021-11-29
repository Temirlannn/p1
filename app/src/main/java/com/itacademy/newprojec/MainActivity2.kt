package com.itacademy.newprojec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity2 : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var imageButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView = findViewById(R.id.imagesview)
        imageButton = findViewById(R.id.btnnazad)

        val image = intent.getIntExtra("IMAGESS", 0)
        imageView.setImageResource(image)

        imageButton.setOnClickListener {
            onBackPressed()
        }
    }
}