package com.kodilla.stream.array;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        IntStream.range(numbers[0], numbers[19]+1)
                .forEach(System.out::println);

        return IntStream.range(numbers[0], numbers[19]+1)
                .average().getAsDouble();

    }
}
