package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int MAX_QUESTIONS = 3;
    private static final int MAX_NUMBER = 100;

    public static void startGame() {
        String name = Cli.greetUser();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            int number = generateRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = getUserInput();

            if (isEven(number) && userAnswer.equalsIgnoreCase("yes")) {
                System.out.println("Correct!");
            } else if (!isEven(number) && userAnswer.equalsIgnoreCase("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + (isEven(number) ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + 1;
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
