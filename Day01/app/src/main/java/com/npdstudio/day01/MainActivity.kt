package com.npdstudio.day01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.npdstudio.day01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // init binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        // connect content view with layout
        setContentView(binding.root)
        val btnClick = binding.btnClick
        binding.tvHello.text = getString(R.string.hello_text, btnClick.text.toString())
        val tip = 10.234f
        btnClick.setOnClickListener {
            Toast.makeText(this, "Your tip is ${kotlin.math.ceil(tip)}", Toast.LENGTH_SHORT).show()
        }
    }
}