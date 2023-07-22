package hexlet.code;

import java.util.Scanner;

public class Cli {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static String greetUser() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = SCANNER.nextLine();
        System.out.println("Hello, " + name + "!");
        return name;
    }
}
