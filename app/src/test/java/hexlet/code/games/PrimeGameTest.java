package hexlet.code.games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeGameTest {

    @Test
    void testIsPrime() {
        assertTrue(PrimeGame.isPrime(2));
        assertTrue(PrimeGame.isPrime(3));
        assertTrue(PrimeGame.isPrime(5));
        assertTrue(PrimeGame.isPrime(7));
        assertTrue(PrimeGame.isPrime(17));
        assertTrue(PrimeGame.isPrime(19));
        assertTrue(PrimeGame.isPrime(97));

        assertFalse(PrimeGame.isPrime(4));
        assertFalse(PrimeGame.isPrime(6));
        assertFalse(PrimeGame.isPrime(8));
        assertFalse(PrimeGame.isPrime(10));
        assertFalse(PrimeGame.isPrime(15));
        assertFalse(PrimeGame.isPrime(100));
    }
}