package com.company.cards;

public interface Deck {
    void shuffle();
    PlayingCards deal();
    void printDeck();
}
