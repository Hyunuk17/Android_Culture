package com.example.myapp1.performance

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Toolbar
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.myapp1.R
import com.example.myapp1.databinding.PerformanceActivityBinding

class PerformanceActivity : AppCompatActivity() {
    lateinit var binding: PerformanceActivityBinding
    private lateinit var pager:ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = PerformanceActivityBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        setSupportActionBar(binding.toolbar)
        setContentView(binding.root)

        pager =binding.viewPager
        pager.adapter = PerformanceAdapter(this)

//        val pageMarginPx = 50
//        val pagerWidth = 300
//        val screenWidth = resources.displayMetrics.widthPixels
//        Log.d("tagS", screenWidth.toString())
//        val offsetPx = screenWidth - pageMarginPx - pagerWidth

        val offsetPx = 200
//        Log.d("tagO", offsetPx.toString())
        pager.setPageTransformer { page, position ->
            page.translationX = position * -offsetPx
//            Log.d("tagP", position.toString())
            Log.d("tagT", page.translationX.toString())
        }



    }
}