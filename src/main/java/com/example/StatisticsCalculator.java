package com.example;

import java.util.Arrays;

public class StatisticsCalculator {
    public static double calculateMean(long[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        double sum = 0;
        for (long num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }

    public static double calculateMedian(long[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }

        long[] sorted = numbers.clone();
        Arrays.sort(sorted);

        int middle = sorted.length / 2;

        if (sorted.length % 2 == 0) {
            return (sorted[middle - 1] + sorted[middle]) / 2.0;
        } else {
            return sorted[middle];
        }
    }
}
