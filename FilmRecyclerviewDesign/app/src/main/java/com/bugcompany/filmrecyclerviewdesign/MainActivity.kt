package com.bugcompany.filmrecyclerviewdesign

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.bugcompany.filmrecyclerviewdesign.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var filmArrayList: ArrayList<FilmModel>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val film1 = FilmModel(1, "Django", R.drawable.django, 14.99)
        val film2 = FilmModel(2, "Bir Zamanlar Anadoluda", R.drawable.birzamanlaranadoluda, 17.99)
        val film3 = FilmModel(3, "The Pianist", R.drawable.thepianist, 18.99)
        val film4 = FilmModel(4, "Interstellar", R.drawable.interstellar, 16.99)
        val film5 = FilmModel(5, "Inception", R.drawable.inception, 14.99)
        val film6 = FilmModel(6, " The Hateful Eight", R.drawable.thehatefuleight, 15.99)

        filmArrayList = ArrayList<FilmModel>()

        filmArrayList.add(film1)
        filmArrayList.add(film2)
        filmArrayList.add(film3)
        filmArrayList.add(film4)
        filmArrayList.add(film5)
        filmArrayList.add(film6)


        binding.apply {
            rv.setHasFixedSize(true)
            rv.layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
            rv.adapter = FilmAdapter(applicationContext, filmArrayList)
        }


    }
}