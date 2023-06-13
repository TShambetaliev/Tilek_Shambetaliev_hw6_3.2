package com.example.tilek_shambetaliev_hw6_32.model

import java.io.Serializable

data class Image(
    var image: String? = null,
    var isSelected: Boolean = false
) : Serializable