package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcGameTest {

    @Test
    public void testGenerateQuestionAndAnswer() {
        String qa = CalcGame.generateQuestionAndAnswer();
        String[] parts = qa.split("\n");
        Assertions.assertEquals(2, parts.length, "The question and answer should be separated by a new line.");

        String question = parts[0];
        String answer = parts[1];

        Assertions.assertTrue(question.matches("\\d+ [-+*] \\d+"),
                "The question should be in the format 'number operator number'.");
        Assertions.assertTrue(answer.matches("-?\\d+"), "The answer should be a valid integer.");

        char operator = question.charAt(question.indexOf(' ') + 1);
        int number1 = Integer.parseInt(question.substring(0, question.indexOf(' ')));
        int number2 = Integer.parseInt(question.substring(question.lastIndexOf(' ') + 1));

        int expected;
        switch (operator) {
            case '+':
                expected = number1 + number2;
                break;
            case '-':
                expected = number1 - number2;
                break;
            case '*':
                expected = number1 * number2;
                break;
            default:
                throw new IllegalStateException("Invalid operation: " + operator);
        }

        int actual = Integer.parseInt(answer);
        Assertions.assertEquals(expected, actual,
                "The generated answer should be correct based on the generated question.");
    }
}
