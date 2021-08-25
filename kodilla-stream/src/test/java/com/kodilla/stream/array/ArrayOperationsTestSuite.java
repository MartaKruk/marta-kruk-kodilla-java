package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] table = new int[20];
        table[0] = 0;
        table[1] = 1;
        table[2] = 2;
        table[3] = 3;
        table[4] = 4;
        table[5] = 5;
        table[6] = 6;
        table[7] = 7;
        table[8] = 8;
        table[9] = 9;
        table[10] = 10;
        table[11] = 11;
        table[12] = 12;
        table[13] = 13;
        table[14] = 14;
        table[15] = 15;
        table[16] = 16;
        table[17] = 17;
        table[18] = 18;
        table[19] = 19;
        //When
        double expectedAverage = 9.5;
        double actualAverage = ArrayOperations.getAverage(table);
        //Then
        assertEquals(expectedAverage, actualAverage);
    }
}
