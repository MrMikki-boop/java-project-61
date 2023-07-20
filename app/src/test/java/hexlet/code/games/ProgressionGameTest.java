package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgressionGameTest {

    @Test
    public void testGenerateProgression() {
        int[] progression = ProgressionGame.generateProgression(5, 2);
        int[] expectedProgression = {0, 2, 4, 6, 8};
        Assertions.assertArrayEquals(expectedProgression, progression, "The generated progression is incorrect.");
    }

    @Test
    public void testFormatProgression() {
        int[] progression = {1, 3, 5, 7, 9};
        String formatted = ProgressionGame.formatProgression(progression, 2);
        String expectedFormatted = "1 3 .. 7 9";
        Assertions.assertEquals(expectedFormatted, formatted, "The formatted progression is incorrect.");
    }
}
