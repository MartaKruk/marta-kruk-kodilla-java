package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    public List<Integer> exterminate(List<Integer> numbers) {
        int temporaryValue;
        List<Integer> evenNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            temporaryValue = number;
            if (temporaryValue % 2 == 0) {
                evenNumbers.add(number);
            }
        }
        return evenNumbers;
    }
}
