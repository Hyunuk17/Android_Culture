package com.example.myapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapp1.book.BookActivity
import com.example.myapp1.movie.MovieActivity
import com.example.myapp1.databinding.ActivityMainBinding
import com.example.myapp1.performance.PerformanceActivity

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.movieButton.setOnClickListener {
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }
        binding.bookButton.setOnClickListener{
                val intent = Intent(this, BookActivity::class.java)
                startActivity(intent)
            }
        binding.perButton.setOnClickListener{
            val intent = Intent(this, PerformanceActivity::class.java)
            startActivity(intent)
        }

    }
}