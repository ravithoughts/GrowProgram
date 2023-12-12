package com.epam.growprogram.collections;

import collectionspackage.Checker;
import collectionspackage.Players;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTaskComparator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of players: ");
        int numberOfPlayers = scanner.nextInt();

        Players[] players = new Players[numberOfPlayers];
        Checker checker = new Checker();

        for (int i = 0; i < players.length; i++) {
            System.out.println("Enter the player name and score: ");
            players[i] = new Players(scanner.next(), scanner.nextInt());
        }

        Arrays.sort(players, checker);

        for (Players player : players) {
            System.out.println("Player name - " + player.name + "--------Score - " + player.score);
        }
    }
}