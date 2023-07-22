package hexlet.code.games;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeGameTest {

    private static final int[] PRIME_NUMBERS = {2, 3, 5, 7, 17, 19, 97};
    private static final int[] NON_PRIME_NUMBERS = {4, 6, 8, 10, 15, 100};

    @Test
    void testIsPrime() {
        for (int prime : PRIME_NUMBERS) {
            assertTrue(PrimeGame.isPrime(prime));
        }

        for (int nonPrime : NON_PRIME_NUMBERS) {
            assertFalse(PrimeGame.isPrime(nonPrime));
        }
    }
}
