package com.example.click_counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.click_counter.R

class MainActivity : AppCompatActivity() {

    private lateinit var countTextView: TextView
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countTextView = findViewById(R.id.textView)
        val incrementButton = findViewById<Button>(R.id.incrementButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val decrementButton = findViewById<Button>(R.id.decrementButton)

        incrementButton.setOnClickListener {
            val prevCount = count
            count++
            countTextView.text = count.toString()
            val message = "Increment: $prevCount -> $count"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        resetButton.setOnClickListener {
            val prevCount = count
            count = 0
            countTextView.text = count.toString()
            val message = "Reset: $prevCount -> $count"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }

        decrementButton.setOnClickListener {
            val prevCount = count
            count--
            countTextView.text = count.toString()
            val message = "Decrement: $prevCount -> $count"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}