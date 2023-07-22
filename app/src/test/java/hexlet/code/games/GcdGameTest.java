// GcdGameTest.java

package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GcdGameTest {

    private static final int POSITIVE_NUMBER_1 = 1;
    private static final int POSITIVE_NUMBER_5 = 5;
    private static final int POSITIVE_NUMBER_7 = 7;
    private static final int POSITIVE_NUMBER_6 = 6;
    private static final int POSITIVE_NUMBER_30 = 30;
    private static final int POSITIVE_NUMBER_18 = 18;
    private static final int POSITIVE_NUMBER_10 = 10;
    private static final int POSITIVE_NUMBER_100 = 100;
    private static final int POSITIVE_NUMBER_17 = 17;
    private static final int POSITIVE_NUMBER_23 = 23;

    private static final int NEGATIVE_NUMBER_1 = -1;
    private static final int NEGATIVE_NUMBER_30 = -30;
    private static final int NEGATIVE_NUMBER_18 = -18;
    private static final int NEGATIVE_NUMBER_10 = -10;
    private static final int NEGATIVE_NUMBER_100 = -100;
    private static final int NEGATIVE_NUMBER_17 = -17;
    private static final int NEGATIVE_NUMBER_23 = -23;

    private static final int ZERO = 0;

    @Test
    public void testCalculateGcd() {
        // Тестовые случаи с положительными числами
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(POSITIVE_NUMBER_1, POSITIVE_NUMBER_1));
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(POSITIVE_NUMBER_5, POSITIVE_NUMBER_7));
        Assertions.assertEquals(POSITIVE_NUMBER_6, GcdGame.calculateGcd(POSITIVE_NUMBER_30, POSITIVE_NUMBER_18));
        Assertions.assertEquals(POSITIVE_NUMBER_10, GcdGame.calculateGcd(POSITIVE_NUMBER_100, POSITIVE_NUMBER_10));
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(POSITIVE_NUMBER_17, POSITIVE_NUMBER_23));

        // Тестовые случаи с отрицательными числами
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(NEGATIVE_NUMBER_1, NEGATIVE_NUMBER_1));
        Assertions.assertEquals(POSITIVE_NUMBER_6, GcdGame.calculateGcd(NEGATIVE_NUMBER_30, NEGATIVE_NUMBER_18));
        Assertions.assertEquals(POSITIVE_NUMBER_10, GcdGame.calculateGcd(NEGATIVE_NUMBER_100, NEGATIVE_NUMBER_10));
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(NEGATIVE_NUMBER_17, NEGATIVE_NUMBER_23));

        // Тестовые случаи со смешанными положительными и отрицательными числами
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(POSITIVE_NUMBER_1, NEGATIVE_NUMBER_1));
        Assertions.assertEquals(POSITIVE_NUMBER_6, GcdGame.calculateGcd(POSITIVE_NUMBER_30, NEGATIVE_NUMBER_18));
        Assertions.assertEquals(POSITIVE_NUMBER_10, GcdGame.calculateGcd(NEGATIVE_NUMBER_100, POSITIVE_NUMBER_10));
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(NEGATIVE_NUMBER_17, POSITIVE_NUMBER_23));

        // Тестовые случаи с нулем
        Assertions.assertEquals(POSITIVE_NUMBER_1, GcdGame.calculateGcd(ZERO, POSITIVE_NUMBER_1));
        Assertions.assertEquals(POSITIVE_NUMBER_5, GcdGame.calculateGcd(POSITIVE_NUMBER_5, ZERO));
        Assertions.assertEquals(ZERO, GcdGame.calculateGcd(ZERO, ZERO));
    }
}
