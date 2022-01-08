package com.yamada;

import com.yamada.lib.Dealer;
import com.yamada.lib.Player;

public class Main {

    public static void main(String[] args) {
        Gameplay game = new Gameplay();
        game.play();

	    // игрок получает от дилера карту из колоды
        /* Player p1 = new Player(null, "Дмитрий", "Дрёмин", 1000);
        Dealer deal = new Dealer();
        p1.setHand(deal.getCard(1));
        System.out.println(p1); */
    }
}
