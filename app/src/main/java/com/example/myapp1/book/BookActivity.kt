package com.example.myapp1.book

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapp1.R
import com.example.myapp1.databinding.BookActivityBinding

class BookActivity :AppCompatActivity() {
    lateinit var binding : BookActivityBinding
    private var bookList:MutableList<Book>? = null
    lateinit var bookAdapter: BookAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = BookActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        bookList = setBookList()
        bookAdapter = BookAdapter(this, bookList)
        binding.bookRecyclerView.adapter = bookAdapter

        val layoutManager = GridLayoutManager(this, 2)
        binding.bookRecyclerView.layoutManager = layoutManager

    }

    fun setBookList(): MutableList<Book>? {
        val bookImage = arrayListOf(
            R.drawable.harry_potter,
            R.drawable.the_greatset_gatsby,
            R.drawable.miracles_of_the_namiya_general_store,
            R.drawable.the_old_man_and_the_sea,
            R.drawable.the_little_prince,
            R.drawable.romeo_and_juliet,
            R.drawable.a_men_called_ove,
            R.drawable.norwegian_wood,
            R.drawable.the_silence_of_lambs,
            R.drawable.the_chronicles_of_narnia
        )
        bookList = mutableListOf(
            Book(bookImage[0], "해리포터와 마법사의 돌","J. K. 롤링", "문학수첩", "2019.11.19",18000),
            Book(bookImage[1], "위대한 개츠비", "F. 스콧 피츠제럴드", "민음사", "2003.05.06", 8100),
            Book(bookImage[2], "나미야 잡화점의 기적", "히가시노 게이고", "현대문학", "2012.12.19", 13200),
            Book(bookImage[3], "노인과 바다", "어니스트 허밍웨이", "민음사", "2012.01.02", 7200),
            Book(bookImage[4], "어린 왕자", "앙투안 드 생텍쥐페리", "열린책들", "2015.10.20", 10620),
            Book(bookImage[5], "로미오와 줄리엣", "윌리엄 셰익스피어", "해와나무", "2022.11.20", 11700),
            Book(bookImage[6], "오베라는 남자", "프레드릭 베크만", "다산책방", "2015.05.20", 12420),
            Book(bookImage[7], "노르웨이의 숲", "무라카미 하루키", "민음사", "2017.08.07", 13500),
            Book(bookImage[8], "양들의 침묵", "토머스 해리스", "나무의철학", "2019.09.11", 13500),
            Book(bookImage[9], "나니아 연대기", "C.S. 루이스", "시공주니어", "2005.11.05",34200)
        )
        return bookList
    }

}
