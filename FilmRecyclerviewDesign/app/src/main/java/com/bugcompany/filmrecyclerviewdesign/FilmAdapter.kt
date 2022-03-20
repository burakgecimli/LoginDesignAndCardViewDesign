package com.bugcompany.filmrecyclerviewdesign

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bugcompany.filmrecyclerviewdesign.databinding.CardViewDesignBinding

class FilmAdapter(private val mContext: Context, private val filmList: List<FilmModel>) :
    RecyclerView.Adapter<FilmAdapter.CardViewDesign>() {


    inner class CardViewDesign(val binding: CardViewDesignBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewDesign {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding = CardViewDesignBinding.inflate(layoutInflater, parent, false)
        return CardViewDesign(binding)
    }

    override fun onBindViewHolder(holder: CardViewDesign, position: Int) {

        val film=filmList[position]
        holder.binding.textViewFilmName.text=film.filmName
        holder.binding.textViewFilmPrice.text="${film.filmPrice} TL"
        holder.binding.imageViewFilm.setImageResource(film.filmImageName)

        holder.binding.button.setOnClickListener {
            Toast.makeText(mContext, "Sepete Eklendi", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return filmList.size
    }


}