package com.gmail.at.boban.talevski.androidsolitaire

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.jetbrains.anko.*
import org.jetbrains.anko.sdk25.coroutines.onClick

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val cardWidth = (displayMetrics.widthPixels - dip(8)) / 7
        val cardHeight = cardWidth * 190 / 140

        verticalLayout {
            leftPadding = dip(4)
            rightPadding = dip(4)
            topPadding = dip(8)

            linearLayout {
                imageView(imageResource = R.drawable.cardback_green5).lparams(cardWidth, cardHeight)
                imageView(imageResource = R.drawable.cardback_blue1).lparams(cardWidth, cardHeight)
                view().lparams(cardWidth, 0)
                for (i in 0..3) {
                    imageView(imageResource = R.drawable.cardback_blue1).lparams(cardWidth, cardHeight)
                }
            }
            linearLayout {

            }
        }
    }
}
