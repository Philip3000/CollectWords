package com.example.collectwords

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.collectwords.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val words = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_main)

        binding.buttonSave.setOnClickListener {
            val word = binding.textMessage.text.toString()
            words.add(word)
        }
        binding.buttonClear.setOnClickListener {
            words.clear()
        }
        binding.buttonShow.setOnClickListener {
            binding.listWords.text = words.toString()
        }
    }
}