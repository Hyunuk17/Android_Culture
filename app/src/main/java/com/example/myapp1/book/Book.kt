package com.example.myapp1.book

import java.io.Serializable

data class Book(var image:Int, var title:String, var author:String, var publisher:String, var publishedDate:String, var price:Int) : Serializable