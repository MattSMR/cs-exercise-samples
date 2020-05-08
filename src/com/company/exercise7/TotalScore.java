package com.company.exercise7;

import java.util.Scanner;

public class TotalScore {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 11; i++) total += scanner.nextInt();
        System.out.println("The total score is " + total + ".");
    }
}
