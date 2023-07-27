package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class ProgressionGame {
    private static final int MAX_QUESTIONS = 3;
    private static final int PROGRESSION_LENGTH_MIN = 5;
    private static final int PROGRESSION_LENGTH_MAX = 10;
    private static final int PROGRESSION_MIN_STEP = 1;
    private static final int PROGRESSION_MAX_STEP = 20;
    private static final String QUESTION = "What number is missing in the progression?";

    public static void startGame() {
        String[][] rounds = generateRounds();
        Engine.playGame(rounds, QUESTION);
    }

    private static String[][] generateRounds() {
        String[][] rounds = new String[MAX_QUESTIONS][2];

        for (int i = 0; i < MAX_QUESTIONS; i++) {
            Random random = new Random();
            int progressionLength = random.nextInt(PROGRESSION_LENGTH_MAX - PROGRESSION_LENGTH_MIN + 1)
                    + PROGRESSION_LENGTH_MIN;
            int progressionStep = random.nextInt(PROGRESSION_MAX_STEP - PROGRESSION_MIN_STEP + 1)
                    + PROGRESSION_MIN_STEP;
            int hiddenIndex = random.nextInt(progressionLength);

            int[] progression = generateProgression(progressionLength, progressionStep);
            String question = "Question: " + formatProgression(progression, hiddenIndex);
            String answer = String.valueOf(progression[hiddenIndex]);

            rounds[i][0] = question;
            rounds[i][1] = answer;
        }

        return rounds;
    }

    public static int[] generateProgression(int length, int step) {
        int[] progression = new int[length];
        for (int i = 0; i < length; i++) {
            progression[i] = i * step;
        }
        return progression;
    }

    public static String formatProgression(int[] progression, int hiddenIndex) {
        String[] numbers = new String[progression.length];

        for (int i = 0; i < progression.length; i++) {
            numbers[i] = (i == hiddenIndex) ? ".." : String.valueOf(progression[i]);
        }

        return String.join(" ", numbers);
    }
}
