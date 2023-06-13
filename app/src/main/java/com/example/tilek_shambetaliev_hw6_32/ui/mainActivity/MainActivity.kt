package com.example.tilek_shambetaliev_hw6_32.ui.mainActivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tilek_shambetaliev_hw6_32.databinding.ActivityMainBinding
import com.example.tilek_shambetaliev_hw6_32.model.Image
import com.example.tilek_shambetaliev_hw6_32.ui.selected.SelectedActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: GalleryAdapter
    private val imageLists = arrayListOf<Image>()
    private val selectedPictures = mutableListOf<Image>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadImages()
        adapter = GalleryAdapter(imageLists, this::addImage, this::removeImage, this::btnVisible)
        binding.apply {
            rvGallery.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rvGallery.adapter = adapter
        }
        initClickListener()

    }

    private fun btnVisible(image: Image) {
        if (!image.isSelected) {
            binding.btnSelected.visibility = View.GONE
        } else {
            binding.btnSelected.visibility = View.VISIBLE
        }
    }

    private fun initClickListener() {
        binding.btnShowSelected.setOnClickListener {
            val bundle = Bundle().apply {
                putSerializable(KEY, ArrayList(selectedPictures))
            }
            val intent = Intent(this, SelectedActivity::class.java)
            intent.putExtras(bundle)
            imageLists.clear()
            selectedPictures.clear()
            startActivity(intent)
        }
    }


    private fun removeImage(image: Image) {
        selectedPictures.add(image)
    }

    private fun addImage(image: Image) {
        selectedPictures.add(image)
    }

    private fun loadImages() {
        imageLists.add(
            Image(
                "https://thedifference.ru/wp-content/uploads/2013/09/chem-otlichaetsya-kon-ot-loshadi.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://islamdag.ru/sites/img/stati/2011/1kv/black-arab-horse_b.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://kubnews.ru/upload/iblock/4e5/4e523d68c56d8710de2e2d5783d18a3a.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://stihi.ru/pics/2013/06/18/9409.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://gamerwall.pro/uploads/posts/2022-07/1657787585_2-gamerwall-pro-p-belii-kon-zimoi-oboi-2.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://www.kartinki24.ru/uploads/gallery/main/59/kartinki24_ru_horses_235.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://www.shkolazhizni.ru/img/content/i156/156835_or.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://wpapers.ru/wallpapers/animals/Horses/2566/PREV_%D0%A7%D0%B5%D1%80%D0%BD%D1%8B%D0%B9-%D0%BA%D0%BE%D0%BD%D1%8C-%D0%B1%D0%B5%D0%B3%D1%83%D1%89%D0%B8%D0%B9-%D0%BF%D0%BE-%D0%B1%D0%B5%D1%80%D0%B5%D0%B3%D1%83.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://img2.akspic.ru/crops/3/3/0/7/5/157033/157033-chernyj_kon-frizskaya_loshad-chernyj_zherebec-zherebec-kon-1920x1080.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://st.depositphotos.com/1637919/2458/i/600/depositphotos_24588031-stock-photo-red-border-collie-dog-and.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://pibig.info/uploads/posts/2021-11/1638218127_2-pibig-info-p-kon-v-pole-priroda-krasivo-foto-3.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://wpapers.ru/wallpapers/animals/Horses/2583/PREV_%D0%A1%D0%BF%D0%BE%D1%80%D1%82%D0%B8%D0%B2%D0%BD%D1%8B%D0%B9-%D0%BA%D0%BE%D0%BD%D1%8C.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://static4.depositphotos.com/1006399/287/i/450/depositphotos_2879428-stock-photo-friesian-horse.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://walldeco.ua/img/gallery/14/thumbs/thumb_l_21881.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://oir.mobi/uploads/posts/2021-05/1620032102_19-oir_mobi-p-begushchii-kon-zhivotnie-krasivo-foto-19.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://celes.club/uploads/posts/2021-11/1637354910_1-celes-club-p-zhirnii-kon-zhivotnie-krasivo-foto-1.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://f10.pmo.ee/akXcbmj3KWY6p0rQ8tjOP5jvY2A=/685x0/filters:focal(1149x404:1167x497)/nginx/o/2023/02/26/15167947t1h1194.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://pw.artfile.me/wallpaper/08-02-2020/650x435/zhivotnye-loshadi-ograda-belyj-kon-polya-1497869.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://krasivosti.pro/uploads/posts/2021-04/1618217270_44-p-samii-krasivii-kon-loshadi-krasivo-foto-47.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://krasivosti.pro/uploads/posts/2021-04/1618217291_49-p-samii-krasivii-kon-loshadi-krasivo-foto-52.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://krot.info/uploads/posts/2021-11/1637765071_1-krot-info-p-kon-i-more-peizazh-krasivoe-foto-1.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://www.colornumbers.ru/wa-data/public/shop/products/41/73/27341/images/42762/42762.900.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://7ogorod.ru/wp-content/uploads/2018/09/horse-1-1.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://pw.artfile.me/wallpaper/13-12-2011/650x431/zhivotnye-loshadi-kon-friz-shajrskaya-po-595907.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://funart.pro/uploads/posts/2021-07/1627132832_23-funart-pro-p-korolevskii-kon-zhivotnie-krasivo-foto-29.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://static.mk.ru/upload/entities/2023/05/17/18/articles/detailPicture/ea/0a/56/16/eeb7f7bdfe35d5ee56082f50567a01bf.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://polit.ru/media/photolib/2021/08/19/ps_Troy_and_a_trojan_horse_Credit-Jorge-Lascar-CC-BY-2-2048x1646_1629361891.jpg",
                false
            )
        )
        imageLists.add(
            Image(
                "https://gamerwall.pro/uploads/posts/2022-08/1661291074_4-gamerwall-pro-p-belii-kon-zimoi-krasivo-5.jpg",
                false
            )
        )


    }


    companion object {
        const val KEY = "key"
    }
}