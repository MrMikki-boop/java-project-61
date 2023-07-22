package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenGameTest {

    private static final int EVEN_NUMBER_0 = 0;
    private static final int EVEN_NUMBER_2 = 2;
    private static final int EVEN_NUMBER_4 = 4;
    private static final int EVEN_NUMBER_100 = 100;
    private static final int EVEN_NUMBER_NEGATIVE_2 = -2;
    private static final int EVEN_NUMBER_NEGATIVE_50 = -50;

    private static final int ODD_NUMBER_1 = 1;
    private static final int ODD_NUMBER_3 = 3;
    private static final int ODD_NUMBER_99 = 99;
    private static final int ODD_NUMBER_NEGATIVE_1 = -1;
    private static final int ODD_NUMBER_NEGATIVE_51 = -51;

    @Test
    public void testIsEven() {
        // Тест четных чисел
        Assertions.assertTrue(EvenGame.isEven(EVEN_NUMBER_0));
        Assertions.assertTrue(EvenGame.isEven(EVEN_NUMBER_2));
        Assertions.assertTrue(EvenGame.isEven(EVEN_NUMBER_4));
        Assertions.assertTrue(EvenGame.isEven(EVEN_NUMBER_100));
        Assertions.assertTrue(EvenGame.isEven(EVEN_NUMBER_NEGATIVE_2));
        Assertions.assertTrue(EvenGame.isEven(EVEN_NUMBER_NEGATIVE_50));

        // Тест нечетных чисел
        Assertions.assertFalse(EvenGame.isEven(ODD_NUMBER_1));
        Assertions.assertFalse(EvenGame.isEven(ODD_NUMBER_3));
        Assertions.assertFalse(EvenGame.isEven(ODD_NUMBER_99));
        Assertions.assertFalse(EvenGame.isEven(ODD_NUMBER_NEGATIVE_1));
        Assertions.assertFalse(EvenGame.isEven(ODD_NUMBER_NEGATIVE_51));
    }
}
