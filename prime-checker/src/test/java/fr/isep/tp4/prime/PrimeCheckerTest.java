package fr.isep.tp4.prime;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PrimeCheckerTest {
    @Test
    void zeroIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(0));
    }

    @Test
    void oneIsNotPrime() {
        assertFalse(PrimeChecker.isPrime(1));
    }

    @Test
    void twoIsPrime() {
        assertTrue(PrimeChecker.isPrime(2));
    }

    @Test
    void checksNumbersUpTo100() {
        List<Integer> primes = List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29,
                31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97);
        for (int number = 0; number <= 100; number++) {
            assertEquals(primes.contains(number), PrimeChecker.isPrime(number), "Number: " + number);
        }
    }
}
