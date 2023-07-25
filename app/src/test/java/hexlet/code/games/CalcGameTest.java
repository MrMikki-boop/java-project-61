package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcGameTest {

    private static final int NUMBER_1 = 2;
    private static final int NUMBER_2 = 3;
    private static final int NUMBER_3 = 5;
    private static final int NUMBER_4 = 4;
    private static final int NUMBER_5 = 20;

    @Test
    public void testGenerateQuestion() {
        String question = CalcGame.generateQuestion(NUMBER_1, NUMBER_2, '+');
        Assertions.assertEquals("2 + 3", question);
    }

    @Test
    public void testCalculateExpression() {
        int result1 = CalcGame.calculateExpression(NUMBER_1, NUMBER_2, '+');
        Assertions.assertEquals(NUMBER_3, result1);

        int result2 = CalcGame.calculateExpression(NUMBER_3, NUMBER_1, '-');
        Assertions.assertEquals(NUMBER_2, result2);

        int result3 = CalcGame.calculateExpression(NUMBER_4, NUMBER_3, '*');
        Assertions.assertEquals(NUMBER_5, result3);

        Assertions.assertThrows(IllegalStateException.class, ()
                -> CalcGame.calculateExpression(NUMBER_1, NUMBER_2, '/'));
    }

    @Test
    public void testGenerateRounds() {
        String[][] rounds = CalcGame.generateRounds();
        Assertions.assertNotNull(rounds);
        Assertions.assertEquals(NUMBER_2, rounds.length);

        for (String[] round : rounds) {
            String question = round[0];
            Assertions.assertTrue(question.matches("\\d+ [+\\-*] \\d+"), "Invalid question format: " + question);
        }

        for (String[] round : rounds) {
            String answer = round[1];
            Assertions.assertDoesNotThrow(() -> Integer.parseInt(answer), "Answer is not a number: " + answer);
        }
    }
}
