package com.company.exercise9;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    private static int random = -1;

    public static void main(String args[]) {
        System.out.println("Guess the number: ");
        Scanner scanner = new Scanner(System.in);
        random = random == -1 ? new Random().nextInt(100) : random;
        int guess = scanner.nextInt();
        if (guess != random) {
            System.out.println("Incorrect. Number is " + (guess > random ? "lower." : "higher."));
            main(null);
        } else System.out.println("Correct!");
    }

}
