package com.itacademy.newprojec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {

    lateinit var imageView: ImageView
    lateinit var imageButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        imageView = findViewById(R.id.imagesview)
        imageButton = findViewById(R.id.btnnazad)


        val number = intent.getIntExtra("NUMBER", 0 )
        if(number == 1){
            imageView.setImageResource(R.drawable.images1)
        }else if(number == 2){
            imageView.setImageResource(R.drawable.images2)
        }else if(number == 3){
            imageView.setImageResource(R.drawable.images3)
        }else {
            Toast.makeText(this,"ERROR",Toast.LENGTH_SHORT).show()
        }
        imageButton.setOnClickListener {
            onBackPressed()
        }
    }
}