package com.example.shiba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val food: Button = findViewById(R.id.food_button)
        val touch: Button = findViewById(R.id.touch_button)

        touch.setOnClickListener {
            imageView.setImageResource(R.drawable.angry_shiba)
            val text = "Don't poke the shiba now it's angry!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
        }

        food.setOnClickListener {
            imageView.setImageResource(R.drawable.calm_shiba)
            val text = "Great! You fed the shiba and it is happy"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
        }
    }
}
