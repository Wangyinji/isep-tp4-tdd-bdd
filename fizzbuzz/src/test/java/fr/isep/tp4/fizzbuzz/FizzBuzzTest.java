package fr.isep.tp4.fizzbuzz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FizzBuzzTest {
    @Test
    void oneReturnsOne() {
        assertEquals("1", FizzBuzz.convert(1));
    }
    @Test
    void twoReturnsTwo(){
        assertEquals("2", FizzBuzz.convert(2));
    }
    @ParameterizedTest(name = "{0} returns {1}")
    @MethodSource("numbersUpTo100")
    void convertsNumbersUpTo100(int number, String expected) {
        assertEquals(expected, FizzBuzz.convert(number));
    }

    static Stream<Arguments> numbersUpTo100() {
        String[] expected = (
                "1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz " +
                "11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz " +
                "Fizz 22 23 Fizz Buzz 26 Fizz 28 29 FizzBuzz " +
                "31 32 Fizz 34 Buzz Fizz 37 38 Fizz Buzz " +
                "41 Fizz 43 44 FizzBuzz 46 47 Fizz 49 Buzz " +
                "Fizz 52 53 Fizz Buzz 56 Fizz 58 59 FizzBuzz " +
                "61 62 Fizz 64 Buzz Fizz 67 68 Fizz Buzz " +
                "71 Fizz 73 74 FizzBuzz 76 77 Fizz 79 Buzz " +
                "Fizz 82 83 Fizz Buzz 86 Fizz 88 89 FizzBuzz " +
                "91 92 Fizz 94 Buzz Fizz 97 98 Fizz Buzz").split(" ");
        return IntStream.rangeClosed(1, 100)
                .mapToObj(number -> Arguments.of(number, expected[number - 1]));
    }
}
