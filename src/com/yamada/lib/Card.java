package com.yamada.lib;

public class Card {

    private int weight;
    private final String value;
    private final String suit;

    public Card(String value, String suit) {
        this.value = value;
        this.suit = suit;
        SetWeight(1);
    }

    public Card(String value, String suit, int setMode) {
        this.value = value;
        this.suit = suit;
        SetWeight(setMode);
    }

    private void SetWeight(int mode) {
        if (mode == 1) { // Black Jack
            switch (value) {
                case "2", "J" -> weight = 2;
                case "3", "Q" -> weight = 3;
                case "4", "K" -> weight = 4;
                case "5" -> weight = 5;
                case "6" -> weight = 6;
                case "7" -> weight = 7;
                case "8" -> weight = 8;
                case "9" -> weight = 9;
                case "10" -> weight = 10;
                case "A" -> weight = 11;
            }
        }
    }

    public int getWeight() {
        return weight;
    }

    public String getValue() {
        return value;
    }

    public String getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "" + value + suit;
    }
}
