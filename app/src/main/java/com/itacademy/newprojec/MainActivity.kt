package com.itacademy.newprojec

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var editText: EditText
    lateinit var button: Button
    lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.edittext)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.images1)
        imageView = findViewById(R.id.images2)
        imageView = findViewById(R.id.images3)


        button.setOnClickListener {
            val number = editText.text.toString().toInt()
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("NUMBER", number)
            startActivity(intent)
            }
        }
}