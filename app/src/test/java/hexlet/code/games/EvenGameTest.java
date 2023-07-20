package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EvenGameTest {

    @Test
    public void testIsEven() {
        // Test even numbers
        Assertions.assertTrue(EvenGame.isEven(0));
        Assertions.assertTrue(EvenGame.isEven(2));
        Assertions.assertTrue(EvenGame.isEven(4));
        Assertions.assertTrue(EvenGame.isEven(100));
        Assertions.assertTrue(EvenGame.isEven(-2));
        Assertions.assertTrue(EvenGame.isEven(-50));

        // Test odd numbers
        Assertions.assertFalse(EvenGame.isEven(1));
        Assertions.assertFalse(EvenGame.isEven(3));
        Assertions.assertFalse(EvenGame.isEven(99));
        Assertions.assertFalse(EvenGame.isEven(-1));
        Assertions.assertFalse(EvenGame.isEven(-51));
    }
}
