package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner in = new Scanner(System.in);
        String trash = "";
        boolean isRunning = true;
        int points = 0;
        System.out.println("Welcome to Craps! Press 1 to play or press -1 to end the game.");
        int input = 0;

        do {
            int roll1 = random.nextInt(6) + 1;
            int roll2 = random.nextInt(6) + 1;
            System.out.println("Press 1 to roll.");
            input = in.nextInt();

            if (input == -1) {
                System.out.println("Ending game!");
                isRunning = false;
            }
            else if (input == 1) {
                int curSum = roll1 + roll2;
                System.out.println("Your first role was a : " + roll1);
                System.out.println("Your second role was a : " + roll2);
                System.out.println("The sum of them together is : " + curSum);

                if (roll1 + roll2 == 2 || roll1 + roll2 == 3 || roll1 + roll2 == 12) {
                    System.out.println("Craps! Game over buddy.");
                    System.exit(0);
                } else if (roll1 + roll2 == 7 || roll1 + roll2 == 11) {
                    System.out.println("Natural! You win the game.");
                    System.exit(0);
                } else if (points == roll1 + roll2) {
                    System.out.println("You made the point sum! You win!");
                    System.exit(0);
                }
                else {
                    points += roll1 + roll2;
                    System.out.println("You currently have " + points + " points.");
                }
            }


        } while (isRunning);


    }

}
