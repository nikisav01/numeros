package com.example;

public class Numeros {
    public static void main(String[] args) {
        int count = 21;

        long[] numbers = FibonacciGenerator.generate(count);

        NumberPrinter.printNumbers(numbers);
        NumberPrinter.printMean(StatisticsCalculator.calculateMean(numbers));
        NumberPrinter.printMedian(StatisticsCalculator.calculateMedian(numbers));
    }
}