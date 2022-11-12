package com.example.myapp1.performance.fragment

import android.os.Bundle
import android.view.ContextMenu
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.myapp1.R

class PosterFragment : Fragment() {
    private var param1:Int? = null
    private var param2:String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let{
            // 인자 대입
            param1 = it.getInt("Poster")
            param2 = it.getString("Title")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Fragment Layout 생성 : performance_poster.xml
        val view =inflater.inflate(R.layout.performance_poster, container, false)
        view.findViewById<ImageView>(R.id.perPoster).setImageResource(param1!!)
        view.findViewById<TextView>(R.id.perTitle).text = param2!!
        return  view
    }



    companion object {
        // 데이터 넣어서 보관
        @JvmStatic
        fun newInstance(param1:Int, param2:String) =
            PosterFragment().apply {
                arguments = Bundle().apply {
                    putInt("Poster", param1)
                    putString("Title", param2)
                }
            }


    }
}