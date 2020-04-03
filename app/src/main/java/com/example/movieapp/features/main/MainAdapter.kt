

package com.example.movieapp.features.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.data.Movie
import com.example.movieapp.databinding.CvMovieSummaryBinding
import com.example.movieapp.ui.main.MainFragmentDirections

/**
 * Adapter for the [RecyclerView] in [MainFragment].
 */
class MainAdapter : ListAdapter<Movie, MainAdapter.ViewHolder>(DiffCallback()) {

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = getItem(position)
        holder.apply {
            bind(createOnClickListener(movie.id, movie.title, movie.release_date, movie.overview), movie)
            itemView.tag = movie
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(CvMovieSummaryBinding.inflate(
                LayoutInflater.from(parent.context), parent, false))
    }

    private fun createOnClickListener(id: Int, title: String, releaseDate: String, overview: String): View.OnClickListener {
        return View.OnClickListener {
            val direction = MainFragmentDirections.mainFragmentToDetailFragment(id, title, releaseDate, overview)
            it.findNavController().navigate(direction)
        }
    }

    class ViewHolder(
        private val binding: CvMovieSummaryBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(listener: View.OnClickListener, item: Movie) {
            binding.apply {
                clickListener = listener
                movie = item
                executePendingBindings()
            }
        }
    }
}

private class DiffCallback : DiffUtil.ItemCallback<Movie>() {

    override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
        return oldItem == newItem
    }
}