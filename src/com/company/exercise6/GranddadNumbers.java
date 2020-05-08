package com.company.exercise6;

import java.util.HashMap;
import java.util.Scanner;

public class GranddadNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What number was drawn?");
        int number = scanner.nextInt();
        while (number > 6 || number < 1) {
            System.out.println("What number was drawn?");
            number = scanner.nextInt();
        }
        System.out.println(new HashMap<>() {
            {
                put(1, "Give Granddad a hug.");
                put(2, "Perform a bush dance.");
                put(3, "Collect $5 from your granddad.");
                put(4, "Go to cinema to watch a movie with granddad.");
                put(5, "Read a story to granddad.");
                put(6, "Sing a song.");
            }
        }.get(number));
        main(null);

    }

}
