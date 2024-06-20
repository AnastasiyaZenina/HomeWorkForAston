package junit_5;

import Factorial.FactorialCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class junit5FactorialTest {

    @Test
    void testFactorialZero() {
        assertEquals(1, FactorialCalculator.factorial(0));
    }

    @Test
    void testFactorialPositive() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }

    @Test
    void testFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> FactorialCalculator.factorial(-1));
    }
}

