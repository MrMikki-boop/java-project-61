package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class PrimeGame {
    private static final int MAX_QUESTIONS = 3;
    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void startGame() {
        String[][] rounds = generateRounds();
        Engine.playGame(rounds, QUESTION);
    }

    private static String[][] generateRounds() {
        String[][] rounds = new String[MAX_QUESTIONS][2];

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            int number = generateRandomNumber();
            String question = Integer.toString(number);
            String correctAnswer = isPrime(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        return rounds;
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(Engine.MAX_NUMBER) + 1;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
