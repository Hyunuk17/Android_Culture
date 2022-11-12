package com.example.myapp1.book

import android.content.Context
import android.content.Intent

import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp1.R
import com.example.myapp1.databinding.BookItemBinding

class BookViewHolder(val binding: BookItemBinding) : RecyclerView.ViewHolder(binding.root)

class BookAdapter(val context: Context, val bookList:MutableList<Book>?) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return BookViewHolder(BookItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding = (holder as BookViewHolder).binding
        binding.bookTItle.text = bookList!![position].title
        binding.bookAuthor.text= bookList!![position].author
        binding.bookImage.setImageResource(bookList!![position].image)

        binding.bookCard.setOnClickListener {
//            showPopupDetails(binding.bookTItle, bookList)
            val intent:Intent = Intent(context, BookDetails::class.java)
            intent.putExtra("bookDetails", bookList!![position])
            context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return bookList!!.size
    }

//    private fun showPopupDetails(view: View, bookList: MutableList<Book>?) {
//        val popup =PopupMenu(context, view)
//        val inflater = popup.menuInflater
//        inflater.inflate(R.menu.book_details, popup.menu)
//        popup.show()
//    }
}