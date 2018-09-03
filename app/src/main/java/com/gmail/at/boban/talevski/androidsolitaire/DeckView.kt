package com.gmail.at.boban.talevski.androidsolitaire

import android.content.Context
import android.view.ViewManager
import android.widget.ImageView
import org.jetbrains.anko.custom.ankoView
import org.jetbrains.anko.imageResource
import org.jetbrains.anko.sdk25.coroutines.onClick

class DeckView(context: Context) : ImageView(context) {
    init {
        imageResource = cardBackDrawable
        onClick {
            GamePresenter.onDeckTap()
        }
    }

    fun update() {
        val cards = GameModel.deck.cardsInDeck
        imageResource = if (cards.size > 0) cardBackDrawable else emptyPileDrawable
    }
}

fun ViewManager.deckView(init: DeckView.() -> Unit = {}) =
        ankoView({ DeckView(it) }, 0, init)