package com.goit.fry;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SumCalculatorTest {

    private SumCalculator calc;

    @BeforeEach
    void init() {

        calc = new SumCalculator();
    }

    @Test
    void testSumOf1Is1() {

        assertEquals(1, calc.sum(1));
    }

    @Test
    void testSumOf4Is10() {

        assertEquals(10, calc.sum(4));
    }

    @Test
    void testSumOf3Is6() {

        assertEquals(6, calc.sum(3));
    }

    @Test
    void testSumOf0ThrowsException() {

        assertThrows(IllegalArgumentException.class, () -> calc.sum(0));
    }
}
