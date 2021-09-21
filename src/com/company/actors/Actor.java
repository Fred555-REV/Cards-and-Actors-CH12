package com.company.actors;

import com.company.cards.Deck;

public interface Actor {

    void getAction(Deck deck);
    boolean getIsPlaying();
    void clear();

}
