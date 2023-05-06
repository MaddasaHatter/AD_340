package com.example.bindingclickcounter


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.bindingclickcounter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.number = "0"

        binding.button1.setOnClickListener {
            binding.name = "Starting Value " + binding.number + " New Value " + (Integer.parseInt(binding.number.toString()) + 1)
            binding.number = "" + (Integer.parseInt(binding.number.toString()) + 1)
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)

            toast.show()
        }

        binding.button2.setOnClickListener {
            binding.name = "Starting Value " + binding.number + " New Value " + (Integer.parseInt(0.toString()))
            binding.number = "0"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)
            toast.show()
        }

        binding.button3.setOnClickListener {
            binding.name = "Starting Value " + binding.number + " New Value " + (Integer.parseInt(binding.number.toString()) - 1)
            binding.number = "" + (Integer.parseInt(binding.number.toString()) - 1)
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)

            toast.show()
        }
    }
}