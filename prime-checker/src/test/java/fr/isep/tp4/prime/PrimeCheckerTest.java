package fr.isep.tp4.prime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckerTest {
    @Test
    void zeroIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(0), "0 is not a prime number");
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(1), "1 is not a prime number");
    }

    @Test
    void twoIsPrime() {
        assertTrue(PrimeChecker.isPrime(2), "2 is a prime number");
    }
}
