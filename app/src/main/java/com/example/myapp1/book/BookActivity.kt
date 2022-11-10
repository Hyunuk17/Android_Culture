package com.example.myapp1.book

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp1.databinding.BookActivityBinding

class BookActivity :AppCompatActivity() {
    lateinit var binding : BookActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = BookActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
