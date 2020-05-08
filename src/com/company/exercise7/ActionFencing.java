package com.company.exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class ActionFencing {

    public static void main(String[] args) {
        int perimeter = new Scanner(in).nextInt();
        List<String> areas = new ArrayList<>();
        for (int i = 1; i < perimeter / 2; i++) {
            if (i * (perimeter / i) == perimeter)
                areas.add("[" + i + ", " + perimeter / i + "]");
        }
        areas.forEach(out::println);
    }

}
