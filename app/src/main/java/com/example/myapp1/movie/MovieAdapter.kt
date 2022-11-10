package com.example.myapp1.movie

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.myapp1.R
import com.example.myapp1.databinding.MovieItemBinding

class  MovieViewHolder(val binding: MovieItemBinding)  :  RecyclerView.ViewHolder(binding.root)

class MovieAdapter(val context: Context, val movieList:MutableList<Movie>?) :RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        return MovieViewHolder(MovieItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val binding =(holder as MovieViewHolder).binding
        binding.movieTitle.text = movieList!![position].title
        binding.movieYear.text = movieList!![position].year.toString()
        binding.movieRating.text = movieList!![position].Rating.toString()
        binding.movieImage.setImageResource(movieList[position].Image)
        binding.starImage.setImageResource(R.drawable.star)
        binding.movieDirector.text = movieList!![position].director

//         클릭하면 영화 정보창으로 화면 전환
        binding.movieLayout.setOnClickListener {
            var link = binding.movieTitle.text
            var address = ""
            when(link) {
                "The Shawshank Redemption" -> address = "https://pedia.watcha.com/ko-KR/contents/mNdKBkO"
                "Life Is Beautiful" -> address = "https://pedia.watcha.com/ko-KR/contents/mV539wO"
                "Inception" -> address = "https://pedia.watcha.com/ko-KR/contents/mW4L2XW"
                "The Dark Knight"-> address = "https://pedia.watcha.com/ko-KR/contents/mJOVXR5"
                "Parasite" -> address = "https://pedia.watcha.com/ko-KR/contents/mdRL4eL"
                "Titanic"-> address = "https://pedia.watcha.com/ko-KR/contents/mJ5x8x5"
                "About Time" -> address = "https://pedia.watcha.com/ko-KR/contents/mO2x9k5"
                "Forrest Gump" -> address = "https://pedia.watcha.com/ko-KR/contents/mY5QvGW"
                "Spirited Away" -> address = "https://pedia.watcha.com/ko-KR/contents/my5YGwO"
                "Leon" -> address = "https://pedia.watcha.com/ko-KR/contents/m15GKp5"
            }

            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(address)
            startActivity(context,intent, null)
        }
    }
    override fun getItemCount(): Int {
        return movieList!!.size
    }


}