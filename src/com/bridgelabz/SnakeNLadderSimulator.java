package com.bridgelabz;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class SnakeNLadderSimulator {
    private static void getDieRoll(){
        Random random = new Random();
        int roll = random.nextInt(6)+1;
        System.out.println(roll);
    }

    public static void main(String[] args) {
        getDieRoll();

    }

}
