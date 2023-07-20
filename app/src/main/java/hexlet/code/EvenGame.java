package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class EvenGame {
    private static final int MAX_QUESTIONS = 3;

    public static void startGame() {
        String name = Cli.greetUser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            int number = generateRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (isEven(number) && userAnswer.equals("yes")) {
                System.out.println("Correct!");
            } else if (!isEven(number) && userAnswer.equals("no")) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + (isEven(number) ? "yes" : "no") + "'.");
                System.out.println("Let's try again!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
