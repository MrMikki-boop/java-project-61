package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GcdGameTest {

    @Test
    public void testCalculateGcd() {
        // Test cases with positive numbers
        Assertions.assertEquals(1, GcdGame.calculateGcd(1, 1));
        Assertions.assertEquals(1, GcdGame.calculateGcd(5, 7));
        Assertions.assertEquals(6, GcdGame.calculateGcd(30, 18));
        Assertions.assertEquals(10, GcdGame.calculateGcd(100, 10));
        Assertions.assertEquals(1, GcdGame.calculateGcd(17, 23));

        // Test cases with negative numbers
        Assertions.assertEquals(1, GcdGame.calculateGcd(-1, -1));
        Assertions.assertEquals(6, GcdGame.calculateGcd(-30, -18));
        Assertions.assertEquals(10, GcdGame.calculateGcd(-100, -10));
        Assertions.assertEquals(1, GcdGame.calculateGcd(-17, -23));

        // Test cases with mixed positive and negative numbers
        Assertions.assertEquals(1, GcdGame.calculateGcd(1, -1));
        Assertions.assertEquals(6, GcdGame.calculateGcd(30, -18));
        Assertions.assertEquals(10, GcdGame.calculateGcd(-100, 10));
        Assertions.assertEquals(1, GcdGame.calculateGcd(-17, 23));

        // Test cases with zero
        Assertions.assertEquals(1, GcdGame.calculateGcd(0, 1));
        Assertions.assertEquals(5, GcdGame.calculateGcd(5, 0));
        Assertions.assertEquals(0, GcdGame.calculateGcd(0, 0));
    }
}
