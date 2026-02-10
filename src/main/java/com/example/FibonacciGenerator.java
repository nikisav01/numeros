package com.example;

public class FibonacciGenerator {
    public static long[] generate(int count) {
        if (count <= 0) {
            return new long[0];
        }

        long[] fibonacci = new long[count];

        fibonacci[0] = 0;
        if (count > 1) fibonacci[1] = 1;
        if (count > 2) fibonacci[2] = 1;

        for (int i = 3; i < count; i++) {
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        return fibonacci;
    }
}
