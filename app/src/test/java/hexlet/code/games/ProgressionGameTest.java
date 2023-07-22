package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProgressionGameTest {

    private static final int PROGRESSION_LENGTH = 5;
    private static final int PROGRESSION_STEP = 2;
    private static final int[] EXPECTED_PROGRESSION = {0, 2, 4, 6, 8};
    private static final int[] TEST_PROGRESSION = {1, 3, 5, 7, 9};

    @Test
    public void testGenerateProgression() {
        int[] progression = ProgressionGame.generateProgression(PROGRESSION_LENGTH, PROGRESSION_STEP);
        Assertions.assertArrayEquals(EXPECTED_PROGRESSION, progression, "The generated progression is incorrect.");
    }

    @Test
    public void testFormatProgression() {
        String formatted = ProgressionGame.formatProgression(TEST_PROGRESSION, PROGRESSION_STEP);
        String expectedFormatted = "1 3 .. 7 9";
        Assertions.assertEquals(expectedFormatted, formatted, "The formatted progression is incorrect.");
    }
}
