package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int originalNumber;
    private static List<Integer> inputList;

    public static void main(String[] args) {
        inputList = new ArrayList<>();
        System.out.println("\nPlease enter a four digit number below. ");
        while(!compare()) main(null);
        int i1 = 2*(inputList.get(1) + inputList.get(3));
        int i2 = inputList.get(0) + inputList.get(2);
        String i = String.valueOf(originalNumber) + String.valueOf(i1 + i2).toCharArray()[String.valueOf(i1 + i2).length() - 1];
        System.out.println(i);
    }

    private static boolean compare() {
        Scanner scanner = new Scanner(System.in);
        originalNumber = Integer.parseInt(scanner.next());
        char[] chars = String.valueOf(originalNumber).toCharArray();
        List<Character> numbers = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
        for (char c : chars) {
            if (!numbers.contains(c)) return false;
            inputList.add(Integer.parseInt(String.valueOf(c)));
        }
        return inputList.size() == 4;
    }

}
