package com.company.exercise10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.*;

public class SimpleDatabase {

    private static List<String> database;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        database = new ArrayList<>();
        run(scanner, scanner.nextLine().split(" "));

    }

    private static void run(Scanner scanner, String[] args) {
        if (Arrays.asList("add", "list", "search", "delete", "sort").contains(args[0])) {
            switch (args[0].toLowerCase()) {
                case "add":
                    System.out.println("Enter as many lines to add to the list then type 'cancel' to finish.");
                    List<String> data = new ArrayList<>();
                    String input = scanner.next();
                    while (!input.equalsIgnoreCase("cancel")) {
                        data.add(input);
                        input = scanner.next();
                    }
                    database.addAll(data);
                    System.out.println("Added " + data.size() + " items to the database.");
                    break;
                case "list":
                    database.forEach(out::println);
                    break;
                case "delete":
                    if (database.contains(args[1])) {
                        database.remove(args[1]);
                        out.println("Removed '" + args[1] + "' from the database.");
                    } else out.println("Database does not contain '" + args[1] + "'.");
                    break;
                case "search":
                    out.println("Search results for '" + args[1] + "':");
                    database.forEach(item -> {
                        if (item.startsWith(args[1]))
                            out.println("\t" + item);
                    });
                    break;
                case "sort":
                    out.println("Sorting alphabetically:");
                    database.stream().sorted().forEach(item -> out.println("\t" + item));
                    break;
                default:
                    out.println("Incorrect arguments. Use 'add', 'list', 'search' or 'delete'.");
                    break;
            }
        }

        run(scanner, scanner.nextLine().split(" "));
    }
}

