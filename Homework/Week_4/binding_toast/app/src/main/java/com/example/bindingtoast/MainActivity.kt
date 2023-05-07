package com.example.bindingtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.bindingtoast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


            binding.button.setOnClickListener {
                binding.name = "Don't Touch Me, Minion!"
                val duration = Toast.LENGTH_SHORT
                val toast = Toast.makeText(applicationContext, binding.name, duration)
                toast.show()
    }
}
}