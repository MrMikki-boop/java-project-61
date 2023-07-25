package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {
    private static final int MAX_QUESTIONS = 3;
    private static final int MAX_NUMBER = 100;
    private static final String QUESTION_EVEN = "Answer 'yes' if the number is even, otherwise answer 'no'. \n";

    public static void startGame() {
        String[][] rounds = generateRounds();
        Engine.playGame(rounds);
    }

    private static String[][] generateRounds() {
        String[][] rounds = new String[MAX_QUESTIONS][2];

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            int number = generateRandomNumber();
            String question = Integer.toString(number);
            String correctAnswer = isEven(number) ? "yes" : "no";

            rounds[i][0] = QUESTION_EVEN + question;
            rounds[i][1] = correctAnswer;
        }

        return rounds;
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(MAX_NUMBER) + 1;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
