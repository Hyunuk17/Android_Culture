package com.example.myapp1.movie

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myapp1.R
import com.example.myapp1.databinding.MovieActivityBinding

class MovieActivity :AppCompatActivity() {
    private var movieList: MutableList<Movie>? = null
    lateinit var binding: MovieActivityBinding
    lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MovieActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)


        supportActionBar?.hide()
        val movieToolbar = findViewById<Toolbar>(R.id.movieToolbar)
        setSupportActionBar(movieToolbar)

        movieList = setMovieList()
        movieAdapter = MovieAdapter(this, movieList)
        binding.movieRecyclerView.adapter = movieAdapter

        val layoutManager =LinearLayoutManager(this)
        binding.movieRecyclerView.layoutManager = layoutManager
//        binding.movieRecyclerView.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL)) // 아티템 간의 구분선
    }

    private fun setMovieList(): MutableList<Movie>? {
    val movieImage = arrayListOf(
        R.drawable.the_shawshank_redemption,
        R.drawable.life_is_beautiful,
        R.drawable.inception,
        R.drawable.the_dart_knight,
        R.drawable.parasite,
        R.drawable.titanic,
        R.drawable.about_time,
        R.drawable.forrest_gump,
        R.drawable.spirited_away,
        R.drawable.leon
    )
        movieList = mutableListOf(
                Movie("The Shawshank Redemption", "Frank Darabont",1994, 4.4, movieImage[0]),
        Movie("Life Is Beautiful","Roberto Benigni",1997, 4.4, movieImage[1]),
        Movie("Inception","Christopher Nolan", 2010, 4.4, movieImage[2]),
        Movie("The Dark Knight","Christopher Nolan", 2008, 4.4, movieImage[3]),
        Movie("Parasite","Bong Joon-ho", 2019, 4.3 , movieImage[4]),
        Movie("Titanic", "James Cameron", 1997, 4.3, movieImage[5]),
        Movie("About Time","Richard Curtis", 2013, 4.3, movieImage[6]),
        Movie("Forrest Gump","Robert Zemeckis", 1994, 4.3, movieImage[7]),
        Movie("Spirited Away", "Miyazaki Hayao", 2001, 4.3, movieImage[8]),
        Movie("Leon", "Luc Besson", 1994, 4.2 ,movieImage[9])
        )
        return movieList
    }
}