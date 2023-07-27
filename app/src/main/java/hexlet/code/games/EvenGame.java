package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class EvenGame {

    private static final String QUESTION = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void startGame() {
        String[][] rounds = generateRounds();
        Engine.playGame(rounds, QUESTION);
    }

    private static String[][] generateRounds() {
        int maxQuestions = 3;
        String[][] rounds = new String[maxQuestions][2];

        for (int i = 0; i < maxQuestions; i++) {
            int number = generateRandomNumber();
            String question = "Question: " + number;
            String correctAnswer = isEven(number) ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }

        return rounds;
    }

    private static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(Engine.MAX_NUMBER) + 1;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
