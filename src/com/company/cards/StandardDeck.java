package com.company.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StandardDeck implements Deck {
    private List<PlayingCards> cards = new ArrayList<>();
    public final String[] SUITS = {
            "Clubs", "Hearts", "Diamonds", "Spades"
    };
    public final String[] VALUES = {
            "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };

    public StandardDeck(){
        for(String suit : SUITS){
            for(String value : VALUES){
                cards.add(new PlayingCards(suit, value));
            }
        }
    }

    public void printDeck(){
        System.out.println(cards);
    }

    @Override
    public void shuffle(){
        Collections.shuffle(cards);
    }

    @Override
    public PlayingCards deal(){
        return cards.remove(cards.size() - 1);
    }
}
