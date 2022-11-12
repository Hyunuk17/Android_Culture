package com.example.myapp1.performance

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapp1.R
import com.example.myapp1.performance.fragment.PosterFragment

class PerformanceAdapter(adapter: PerformanceActivity) : FragmentStateAdapter(adapter) {
    private val poster = mutableListOf(R.drawable.iu_concert, R.drawable.cats, R.drawable.coldplay_concert, R.drawable.phantom_of_the_opera, R.drawable.maroo5_conert, R.drawable.les_miserables)
    private val title = mutableListOf("IU : The Gold Hour", "Cats", "Coldplay : A Headfull Of Dreams", "The Phantom Of The Opera", "Maroon 5 : Brideston Arena Concert", "Les Miserables")
    override fun getItemCount(): Int {
        return poster.size
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> PosterFragment.newInstance(poster[0], title[0])
            1 -> PosterFragment.newInstance(poster[1], title[1])
            2 -> PosterFragment.newInstance(poster[2], title[2])
            3 -> PosterFragment.newInstance(poster[3], title[3])
            4 -> PosterFragment.newInstance(poster[4], title[4])
            else -> PosterFragment.newInstance(poster[5], title[5])
        }
    }
}