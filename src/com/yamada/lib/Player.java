package com.yamada.lib;

import java.util.ArrayList;

public class Player {

    private ArrayList<Card> hand;
    private String firstName;
    private int money;

    public Player(ArrayList<Card> hand, String firstName, int money) {
        this.hand = hand;
        this.firstName = firstName;
        this.money = money;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public String getFirstName() {
        return firstName;
    }


    public int getMoney() {
        return money;
    }

    public void setHand(ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Player{" +
                "hand=" + hand +
                ", firstName='" + firstName + '\'' +
                ", money=" + money +
                '}';
    }
}
