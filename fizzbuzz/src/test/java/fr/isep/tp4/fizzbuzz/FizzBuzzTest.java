package fr.isep.tp4.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void oneReturnsOne() {
        assertEquals("1", FizzBuzz.convert(1));
    }
    @Test
    void twoReturnsTwo(){
        assertEquals("2",FizzBuzz.convert(2))
    }
}
