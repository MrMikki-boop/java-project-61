package hexlet.code.games;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PrimeGameTest {

    @Test
    public void testIsPrime() {
        // Test prime numbers
        Assertions.assertTrue(PrimeGame.isPrime(2));
        Assertions.assertTrue(PrimeGame.isPrime(3));
        Assertions.assertTrue(PrimeGame.isPrime(5));
        Assertions.assertTrue(PrimeGame.isPrime(7));
        Assertions.assertTrue(PrimeGame.isPrime(17));
        Assertions.assertTrue(PrimeGame.isPrime(19));
        Assertions.assertTrue(PrimeGame.isPrime(97));

        // Test non-prime numbers
        Assertions.assertFalse(PrimeGame.isPrime(1));
        Assertions.assertFalse(PrimeGame.isPrime(4));
        Assertions.assertFalse(PrimeGame.isPrime(6));
        Assertions.assertFalse(PrimeGame.isPrime(8));
        Assertions.assertFalse(PrimeGame.isPrime(10));
        Assertions.assertFalse(PrimeGame.isPrime(15));
        Assertions.assertFalse(PrimeGame.isPrime(100));
    }
}
