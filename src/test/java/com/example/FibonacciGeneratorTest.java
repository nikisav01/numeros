package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {

    @Test
    void testGenerateZeroNumbers() {
        long[] expected = {};
        long[] actual = FibonacciGenerator.generate(0);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGenerateOneNumber() {
        long[] expected = {0};
        long[] actual = FibonacciGenerator.generate(1);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGenerateFirst21Numbers() {
        long[] expected = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};
        long[] actual = FibonacciGenerator.generate(21);
        assertArrayEquals(expected, actual);
    }

    @Test
    void testGenerateNegativeCount() {
        long[] expected = {};
        long[] actual = FibonacciGenerator.generate(-5);
        assertArrayEquals(expected, actual);
    }
}