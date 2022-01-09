package com.yamada;

import com.yamada.lib.Card;
import com.yamada.lib.Dealer;
import com.yamada.lib.Player;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Gameplay {

    private Player player;
    private Dealer dealer;
    private final Scanner scan = new Scanner(System.in);
    private String command;

    public void console() {
        hello();
        boolean exe = true;

        while (exe) {
            System.out.print("> ");
            command = (scan.nextLine()).toLowerCase(Locale.ROOT);

            switch (command) {
                case "exit" -> exe = false;
                case "help" -> System.out.println(help());
                case "play" -> play();
            }
        }

    }

    private void play() {
        initPlayer();

        // game session
        boolean exe = true;
        while (exe) {
            dealer.fillDeck(52);
            dealer.updateDeck();
            player.setHand(dealer.getCard(2));

            boolean isGetNewCard = false;
            do {
                System.out.println(player);
                System.out.println("Взять еще одну карту? Y/n\n");
                command = (scan.nextLine()).toLowerCase(Locale.ROOT);
                if (command.equals("y")) {
                    isGetNewCard = true;
                    ArrayList<Card> temp = player.getHand();
                    temp.add(dealer.getCard());
                    player.setHand(temp);
                } else {
                    isGetNewCard = false;
                }
            } while (isGetNewCard);

            System.out.println("Сыграть еще раз? y/N");
            command = (scan.nextLine()).toLowerCase(Locale.ROOT);
            exe = command.equals("y");

        }

    }

    private String help() {
        return """
                СПРАВКА ПО КОМАНДАМ:
                PLAY | Приступить к игре
                HELP | Вывести справку на экран
                EXIT | Выйти из приложения
                """;
    }

    private void hello() {
        System.out.println("Казино 0.2.а\nДля вывода справки используйте: help\n(C) Yamada.\n");
    }

    private void initPlayer() {
        System.out.println("Введите ваше имя: ");
        String temp = scan.nextLine();
        player = new Player(null, temp, 1000);
        dealer = new Dealer();
    }
}
