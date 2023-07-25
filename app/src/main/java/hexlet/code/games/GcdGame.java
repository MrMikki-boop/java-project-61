package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class GcdGame {
    private static final int MAX_QUESTIONS = 3;
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void startGame() {
        String[][] rounds = generateRounds();
        Engine.playGame(rounds, QUESTION);
    }

    private static String[][] generateRounds() {
        String[][] rounds = new String[MAX_QUESTIONS][2];

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            int number1 = generateRandomNumber();
            int number2 = generateRandomNumber();

            String question = number1 + " " + number2;
            String correctAnswer = Integer.toString(calculateGcd(number1, number2));

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        return rounds;
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(Engine.MAX_NUMBER) + 1;
    }

    public static int calculateGcd(int number1, int number2) {
        while (number2 != 0) {
            int temp = number2;
            number2 = number1 % number2;
            number1 = temp;
        }
        return Math.abs(number1);
    }
}
