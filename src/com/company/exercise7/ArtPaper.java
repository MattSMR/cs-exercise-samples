package com.company.exercise7;

import java.util.Scanner;

public class ArtPaper {

    public static void main(String[] args) {
        int i = new Scanner(System.in).nextInt();
        System.out.println(i >= 0 ? "There is " + (200 - i) + "m of paper left." : "There is not enough paper to do that.");
    }

}
