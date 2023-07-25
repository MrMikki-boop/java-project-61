package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static void playGame(String[][] rounds, String question) {
        String name = Cli.greetUser();
        Scanner scanner = new Scanner(System.in);
        System.out.print(question);

        for (String[] round : rounds) {
            String questionText = round[0];
            String correctAnswer = round[1];

            System.out.println("Question: " + questionText);
            System.out.print("Your answer: ");
            String userAnswer = scanner.next();

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + correctAnswer + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }
}
