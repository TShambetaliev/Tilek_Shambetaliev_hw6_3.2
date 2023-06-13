package com.example.tilek_shambetaliev_hw6_32.ui.selected

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tilek_shambetaliev_hw6_32.databinding.ItemGalleryBinding
import com.example.tilek_shambetaliev_hw6_32.loadImage
import com.example.tilek_shambetaliev_hw6_32.model.Image

class SelectedAdapter(
    val imageList: ArrayList<Image>
) : RecyclerView.Adapter<SelectedAdapter.SelectedViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SelectedViewHolder {
        return SelectedViewHolder(
            ItemGalleryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = imageList.size

    override fun onBindViewHolder(holder: SelectedViewHolder, position: Int) {
        holder.bind()
    }


    inner class SelectedViewHolder(private val binding: ItemGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind() {
            val item = imageList[adapterPosition]
            item.image?.let { binding.imageView.loadImage(it) }
        }
    }
}