package com.example.myapp1.book


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.Window
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapp1.R
import com.example.myapp1.databinding.BookDetailsBinding



class BookDetails : AppCompatActivity() {
    lateinit var binding: BookDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        binding = BookDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bookDetails =intent.getSerializableExtra("bookDetails") as Book

        binding.bookDetailImage.setImageResource(bookDetails.image)
        binding.bookDetailTItle.text = bookDetails.title
        binding.bookDetailAuthor.text = bookDetails.author
        binding.bookDetailPublisher.text = bookDetails.publisher
        binding.bookDetailDate.text = bookDetails.publishedDate
        binding.bookDetailPrice.text = bookDetails.price.toString()+"원"

        binding.moreInfo.setOnClickListener {
            var name = binding.bookDetailTItle.text
            var address = ""
            when(name) {
                "해리포터와 마법사의 돌" -> address ="http://www.yes24.com/Product/Goods/82943354"
                "위대한 개츠비" -> address ="http://www.yes24.com/Product/Goods/370331"
                "나미야 잡화점의 기적" -> address="http://www.yes24.com/Product/Goods/8157957"
                "노인과 바다" -> address="http://www.yes24.com/Product/Goods/6157159"
                "어린 왕자" -> address="http://www.yes24.com/Product/Goods/22431294"
                "로미오와 줄리엣" -> address="http://www.yes24.com/Product/Goods/115222385"
                "오베라는 남자" -> address="http://www.yes24.com/Product/Goods/17932082"
                "노르웨이의 숲" -> address="http://www.yes24.com/Product/Goods/44499829"
                "양들의 침묵" -> address="http://www.yes24.com/Product/Goods/78515818"
                "나니아 연대기" -> address="http://www.yes24.com/Product/Goods/1942709"
            }

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(address)
            startActivity(intent)
        }
    }
}