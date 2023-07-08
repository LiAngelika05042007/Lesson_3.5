package com.angelika.lesson_35

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.angelika.lesson_35.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var initialCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        plusClick()
        minusClick()

        savedInstanceState?.let {
            initialCount = it.getInt("count", 0)
            binding.tvNumbers.text = initialCount.toString()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("count", initialCount)
    }

    private fun plusClick() = with(binding) {
        btnPlus.setOnClickListener {
            if (initialCount < 10) {
                initialCount++
                tvNumbers.text = initialCount.toString()
            } else {
                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }

    private fun minusClick() = with(binding) {
        btnMinus.setOnClickListener {
            if (initialCount > 0) {
                initialCount--
                tvNumbers.text = initialCount.toString()
            }
        }
    }
}
