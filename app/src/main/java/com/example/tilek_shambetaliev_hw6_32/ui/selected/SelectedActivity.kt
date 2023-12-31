package com.example.tilek_shambetaliev_hw6_32.ui.selected

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tilek_shambetaliev_hw6_32.databinding.ActivitySelectedBinding
import com.example.tilek_shambetaliev_hw6_32.model.Image
import com.example.tilek_shambetaliev_hw6_32.ui.mainActivity.MainActivity

class SelectedActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySelectedBinding

    private val lists = arrayListOf<Image>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySelectedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras
        val selectedPictures = bundle?.getSerializable(MainActivity.KEY) as? ArrayList<Image>

        if (selectedPictures.isNullOrEmpty()) {
            binding.rvSelected.visibility = View.GONE
        } else {
            lists.addAll(selectedPictures)
            val adapter = SelectedAdapter(lists)
            binding.rvSelected.apply {
                layoutManager = GridLayoutManager(context, 3)
                this.adapter = adapter
            }
        }


        binding.imgArrowBack.setOnClickListener {
            onBackPressed()
        }

    }
}