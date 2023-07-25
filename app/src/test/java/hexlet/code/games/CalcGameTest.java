package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcGameTest {

    @Test
    public void testGenerateQuestion() {
        String question = CalcGame.generateQuestion(2, 3, '+');
        Assertions.assertEquals("2 + 3", question);
    }

    @Test
    public void testCalculateExpression() {
        int result1 = CalcGame.calculateExpression(2, 3, '+');
        Assertions.assertEquals(5, result1);

        int result2 = CalcGame.calculateExpression(5, 2, '-');
        Assertions.assertEquals(3, result2);

        int result3 = CalcGame.calculateExpression(4, 5, '*');
        Assertions.assertEquals(20, result3);

        Assertions.assertThrows(IllegalStateException.class, () -> CalcGame.calculateExpression(2, 3, '/'));
    }

    @Test
    public void testGenerateRounds() {
        String[][] rounds = CalcGame.generateRounds();
        Assertions.assertNotNull(rounds);
        Assertions.assertEquals(3, rounds.length);

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
