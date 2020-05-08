package com.company.exercise6;

import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

    public static void main(String[] args) {
        System.out.println("Guess two numbers.");
        Scanner scanner = new Scanner(System.in);
        int random = new Random().nextInt(100);
        int sum = scanner.nextInt() + scanner.nextInt();
        while (sum != random) {
            System.out.println(sum > random ? "Lower" : "Higher");
            System.out.println("Guess two numbers.");
            sum = scanner.nextInt() + scanner.nextInt();
        }
        System.out.println("You guessed correctly.\n\n");
        main(null);
    }

}
