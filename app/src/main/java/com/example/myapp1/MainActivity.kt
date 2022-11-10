package com.example.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp1.book.BookActivity
import com.example.myapp1.movie.MovieActivity
import com.example.myapp1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.MovieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
        binding.BookButton.setOnClickListener{
                val intent = Intent(this, BookActivity::class.java)
                startActivity(intent)
            }
//        binding.PerButton.setOnClickListener{
//            val intent = Intent(this, PerformanceActivity::class.java)
//            startActivity(intent)
//        }

    }
}