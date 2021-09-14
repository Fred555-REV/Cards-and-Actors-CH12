package com.company.cards;

public class PlayingCards {
    public final String suit;
    public final String value;

    public PlayingCards(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }
}
