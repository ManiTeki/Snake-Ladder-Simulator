package com.bridgelabz;

import java.util.Scanner;

public class SnakNLaddSnglPlyrUC1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int numPlayers = 0; numPlayers <= 1; numPlayers++) {
            System.out.println("Enter The number of player: ");
            numPlayers = scan.nextInt();
        }
    }

}
