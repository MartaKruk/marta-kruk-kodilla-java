package com.kodilla.testing.numeral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumeralSystemsTestSuite {

    @Test
    void testDecToOct() {
        //Given
        NumeralSystemsCalculator numeralSystemsCalculator = new NumeralSystemsCalculator();
        //When
        String result = numeralSystemsCalculator.decToOct(82);
        //Then
        assertEquals("122",result);
    }

    @Test
    void testDecToHex() {
        //Given
        NumeralSystemsCalculator numeralSystemsCalculator = new NumeralSystemsCalculator();
        //When
        String result = numeralSystemsCalculator.decToHex(1500);
        //Then
        assertEquals("5dc", result);
    }

}
