package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class CalcGame {
    private static final int MAX_QUESTIONS = 3;
    private static final int MAX_NUMBER = 20;
    private static final char[] OPERATIONS = {'+', '-', '*'};
    private static final String QUESTION_CALC = "What is the result of the expression? \n";

    public static void startGame() {
        String[][] rounds = generateRounds();
        Engine.playGame(rounds);
    }

    private static String[][] generateRounds() {
        String[][] rounds = new String[MAX_QUESTIONS][2];

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            Random random = new Random();
            int number1 = random.nextInt(MAX_NUMBER) + 1;
            int number2 = random.nextInt(MAX_NUMBER) + 1;
            char operation = OPERATIONS[random.nextInt(OPERATIONS.length)];

            String question = generateQuestion(number1, number2, operation);
            String answer = String.valueOf(calculateExpression(number1, number2, operation));

            rounds[i][0] = QUESTION_CALC + question;
            rounds[i][1] = answer;
        }
        return rounds;
    }

    private static String generateQuestion(int number1, int number2, char operation) {
        return number1 + " " + operation + " " + number2;
    }

    private static int calculateExpression(int number1, int number2, char operation) {
        switch (operation) {
            case '+':
                return number1 + number2;
            case '-':
                return number1 - number2;
            case '*':
                return number1 * number2;
            default:
                throw new IllegalStateException("Invalid operation: " + operation);
        }
    }
}
