package com.yamada;

import com.yamada.lib.Player;

import java.util.Scanner;

public class Gameplay {

    private Player player;
    private final Scanner scan = new Scanner(System.in);

    public void play() {
        hello();
        boolean exe = true;
        String command;

        while (exe) {
            System.out.print("> ");
            command = scan.nextLine();

            switch (command) {
                case "exit":
                    exe = false;
                    break;
            }
        }

    }

    private void hello() {
        System.out.println("Казино 0.2.а\nДля вывода справки используйте: help\n(C) Yamada.\n");
    }

    private void initPlayer() {
        System.out.println("Введите ваше имя: ");
        player.setFirstName(scan.nextLine());
    }
}
