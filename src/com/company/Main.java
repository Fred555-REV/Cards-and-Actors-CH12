package com.company;

import com.company.cards.CheatDeck;
import com.company.cards.Deck;

public class Main {

    public static void main(String[] args) {
        Deck deck = new CheatDeck();

        deck.shuffle();

        for(int i = 0; i < 5; i++){
            System.out.println(deck.deal());
        }
    }
}
