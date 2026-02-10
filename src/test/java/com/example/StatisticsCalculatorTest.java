package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsCalculatorTest {

    @Test
    void testCalculateMeanOfFibonacci21() {
        long[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};
        double mean = StatisticsCalculator.calculateMean(numbers);
        assertEquals(843.33, mean, 0.01);
    }

    @Test
    void testCalculateMeanOfEmptyArray() {
        long[] numbers = {};
        double mean = StatisticsCalculator.calculateMean(numbers);
        assertEquals(0.0, mean, 0.01);
    }

    @Test
    void testCalculateMedianOfFibonacci21() {
        long[] numbers = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};
        double median = StatisticsCalculator.calculateMedian(numbers);
        assertEquals(55.0, median, 0.01);
    }

    @Test
    void testCalculateMedianOfEmptyArray() {
        long[] numbers = {};
        double median = StatisticsCalculator.calculateMedian(numbers);
        assertEquals(0.0, median, 0.01);
    }
}