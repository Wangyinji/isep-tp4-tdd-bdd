package fr.isep.tp4.prime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertFalse;

class PrimeCheckerTest {
    @Test
    void zeroIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(0), "0 is not a prime number");
    }
}
