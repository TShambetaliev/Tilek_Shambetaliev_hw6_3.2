package com.example.tilek_shambetaliev_hw6_32.ui.mainActivity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.tilek_shambetaliev_hw6_32.model.Image
import com.example.tilek_shambetaliev_hw6_32.loadImage
import com.example.tilek_shambetaliev_hw6_32.databinding.ItemGalleryBinding

class GalleryAdapter(
    private val imageList: ArrayList<Image>,
    private val addImage: (item: Image) -> Unit,
    private val removeImage: (item: Image) -> Unit,
    private val btnVisible: (item: Image) -> Unit
) : Adapter<GalleryAdapter.GalleryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        return GalleryViewHolder(
            ItemGalleryBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount() = imageList.size

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(imageList[position])
    }

    inner class GalleryViewHolder(private val binding: ItemGalleryBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(image: Image) {
            image.image?.let { binding.imageView.loadImage(it) }

            itemView.setOnClickListener {
                image.isSelected = !image.isSelected


                if (image.isSelected) {
                    binding.selectionOverlay.visibility = View.VISIBLE
                    addImage(image)
                    btnVisible(image)
                } else {
                    removeImage(image)
                    binding.selectionOverlay.visibility = View.GONE
                }

            }
        }
    }
}