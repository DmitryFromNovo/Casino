package com.yamada.lib;

import java.util.ArrayList;
import java.util.Collections;
// import java.util.Random;

public class Dealer {

    private ArrayList<Card> deck;

    // constructor
    public Dealer() {
        fillDeck(52);
        updateDeck();
    }

    public Dealer(int lengthDeck) {
        fillDeck(lengthDeck);
        updateDeck();
    }

    // fill deck cards
    public void fillDeck(int length) {
        if (length == 52) {
            deck = new ArrayList<Card>(52);
            String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            String[] suit = {"♡", "♤", "♧", "♢"};

            int x = 0;
            for (String i: values) {
                for (String j: suit) {
                    deck.add(new Card(i, j));
                    x++;
                }
            }
        } else if (length == 36) {
            deck = new ArrayList<Card>(36);
            String[] values = {"6", "7", "8", "9", "10", "J", "Q", "K", "A"};
            String[] suit = {"♡", "♤", "♧", "♢"};

            int x = 0;
            for (String i: values) {
                for (String j: suit) {
                    deck.add(new Card(i, j));
                    x++;
                }
            }
        } else if (length == 24) {
            deck = new ArrayList<Card>(24);
            String[] values = {"9", "10", "J", "Q", "K", "A"};
            String[] suit = {"♡", "♤", "♧", "♢"};

            int x = 0;
            for (String i: values) {
                for (String j: suit) {
                    deck.add(new Card(i, j));
                    x++;
                }
            }
        } else {
            System.out.println("fatal: lengthDeck is not valid");
        }
    }

    // shuffle deck
    public void updateDeck() {
        Collections.shuffle(deck);

        /* Random rnd = new Random();
        for(int i = 0; i < deck.size(); i++) {
            int index = rnd.nextInt(i + 1);
            Card a = deck.get(index);
            deck.set(index, deck.get(i));
            deck.set(i, a);
        } */
    }

    // get card(-s)
    public Card getCard() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    public ArrayList<Card> getCard(int count) {
        ArrayList<Card> cards = new ArrayList<Card>(count);
        for (int i = 0; i < count; i++) {
            cards.add(deck.get(0));
            deck.remove(0);
        }

        return cards;
    }
}
