package com.company.exercise9;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Slots {

    public static void main(String[] args) {
        List<String> outcomes = Arrays.asList("GRAPES", "BANANAS", "APPLES", "ORANGES", "MR HO");
        String[] chosen = new String[3];
        for (int i = 0; i < 3; i++)
            chosen[i] = outcomes.get(new Random().nextInt(outcomes.size()));
        System.out.println(chosen[0] + " - " + chosen[1] + " - " + chosen[2]);
        if (chosen[0].equalsIgnoreCase(chosen[1]) && chosen[1].equalsIgnoreCase(chosen[2]))
            System.out.println("JACKPOT!");
    }

}
