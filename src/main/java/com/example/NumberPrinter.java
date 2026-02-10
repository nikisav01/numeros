package com.example;

public class NumberPrinter {
    public static void printNumbers(long[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public static void printMean(double mean) {
        System.out.printf("The mean is %.2f%n", mean);
    }

    public static void printMedian(double median) {
        System.out.printf("The median is %.0f%n", median);
    }
}
