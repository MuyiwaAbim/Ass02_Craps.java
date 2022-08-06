package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String playAgain;
        int sumOfDice;
        int point;

        do
        {
            sumOfDice = crapsRoll();

            if (sumOfDice == 7 || sumOfDice == 11)
            {
                System.out.println("You rolled " + sumOfDice + "\nYou got a natural and Won");
            }
            else if (sumOfDice == 2 || sumOfDice == 3 || sumOfDice == 12)
            {
                System.out.println("You rolled " + sumOfDice + "\nYou crapped out and Lost");
            }
            else
            {
                System.out.println("You rolled " + sumOfDice + "\nThis is now the point");
                point = sumOfDice;

                do
                {
                    sumOfDice = crapsRoll();

                    if (!(sumOfDice == point || sumOfDice == 7))
                    {
                        System.out.println("You rolled " + sumOfDice + " which is neither the point (" + point + ") nor 7 \nRolling again");
                    }
                }
                while (!(sumOfDice == point || sumOfDice == 7));

                if (sumOfDice == point)
                {
                    System.out.println("You rolled " + sumOfDice + " which is the point \nYou Won");
                }
                else
                {
                    System.out.println("You rolled 7 before you rolled the point \nYou Lost");
                }
            }

            do
            {
                System.out.println("Would you like to play again? (Y/N)");
                playAgain = in.nextLine();
                if (playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N"))
                {
                    break;
                }
                else
                {
                    System.out.println("Please enter a valid response");
                }
            }
            while (!(playAgain.equalsIgnoreCase("Y") || playAgain.equalsIgnoreCase("N")));
        }
        while (playAgain.equalsIgnoreCase("Y"));
    }
    public static int crapsRoll()
    {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int score = die1 + die2;
        return score;
    }
}