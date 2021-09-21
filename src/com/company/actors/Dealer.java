package com.company.actors;

import com.company.cards.Deck;
import com.company.cards.PlayingCards;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Actor {
    public String name;
    private int handValue;
    public boolean isPlaying;
    public List<PlayingCards> cards = new ArrayList<>();

    public Dealer(String name) {
        this.name = name;
        isPlaying = true;
        handValue = 0;
    }

    @Override
    public void getAction(Deck deck) {
        if (getValue() >= 17) {
            stand();
        } else {
            hit(deck);
        }
    }

    private int getValue() {
        handValue =0;
        boolean hasAce = false;
        for (PlayingCards card : cards) {
            handValue += card.value;
            if (card.value == 11) {
                hasAce = true;
            }
        }
        if (handValue > 21 && hasAce) {
            handValue -= 10;
        }
        return handValue;
    }

    private void hit(Deck deck) {
        cards.add(deck.deal());
    }

    private void stand() {
        isPlaying = false;
    }

    @Override
    public void clear() {
        isPlaying = true;
        cards.removeAll(cards);
    }

    @Override
    public boolean getIsPlaying() {
        return isPlaying;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "name='" + name + '\'' +
                ", cards=" + cards +
                '}';
    }
}
