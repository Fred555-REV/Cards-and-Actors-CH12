package com.company;

import com.company.actors.Actor;
import com.company.actors.Dealer;
import com.company.actors.Player;
import com.company.cards.CheatDeck;
import com.company.cards.Deck;
import com.company.cards.StandardDeck;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Deck deck = new StandardDeck();
        while (deck.getDeckSize() > 0) {
            deck.shuffle();
            play(deck);
        }
    }

    public static void play(Deck deck) {
        Scanner scan = new Scanner(System.in);
        Actor dealer = new Dealer("Dealer");
        while (dealer.getIsPlaying()) {
            dealer.getAction(deck);
            System.out.println(dealer);
            System.out.println("Press enter to continue");
            scan.nextLine();
        }
        dealer.clear();
    }
}
