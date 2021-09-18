package com.showtyclef.gmotivation.data

import com.showtyclef.gmotivation.R
import com.showtyclef.gmotivation.presentation.Quotes

class DataSource {
    fun loadQuotes() : List<Quotes> {
        return listOf(
            Quotes(R.string.motivation1, R.drawable.img4),
            Quotes(R.string.motivation2, R.drawable.img2),
            Quotes(R.string.motivation3, R.drawable.img7),
            Quotes(R.string.motivation4, R.drawable.img6),
            Quotes(R.string.motivation5, R.drawable.img5),
            Quotes(R.string.motivation6, R.drawable.img1),
            Quotes(R.string.motivation7, R.drawable.img3),
            Quotes(R.string.motivation8, R.drawable.img8),
            Quotes(R.string.motivation9, R.drawable.img9),
            Quotes(R.string.motivation10, R.drawable.img10),
            Quotes(R.string.motivation11, R.drawable.img11),
            Quotes(R.string.motivation12, R.drawable.img12),
            Quotes(R.string.motivation13, R.drawable.img13),
            Quotes(R.string.motivation14, R.drawable.img14),
            Quotes(R.string.motivation15, R.drawable.img15)
        )
    }
}