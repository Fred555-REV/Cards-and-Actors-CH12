package com.company.cards;

import java.util.Locale;

public class PlayingCards {
    public final String suit;
    public final String rank;
    public final int value;

    public PlayingCards(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
        value = getCardValue();
    }

    private int getCardValue() {
        //"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
        switch (rank.toLowerCase(Locale.ROOT)) {
            case "ace":
                return 11;
            case "jack":
            case "queen":
            case "king":
                return 10;
            default:
                return Integer.parseInt(rank);
        }
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }
}
