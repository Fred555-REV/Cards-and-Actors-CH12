package com.company.actors;

import com.company.cards.Deck;

public class Player implements Actor{
public String name;
public int handValue;


    @Override
    public void getAction(Deck deck) {

    }

    @Override
    public boolean getIsPlaying() {
        return false;
    }
    @Override
    public void clear() {

    }

}
