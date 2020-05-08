package com.company.exercise8;

public class NumberPrinter {

    public static void main(String[] args) {
        int x = 10;
        for (int i = 0; i < 4; i++) {
            StringBuilder line = new StringBuilder();
            for (int o = 0; o < 10; o++) {
                line.append(x++).append(" ");
            }
            System.out.println(line.toString());
        }
    }

}
