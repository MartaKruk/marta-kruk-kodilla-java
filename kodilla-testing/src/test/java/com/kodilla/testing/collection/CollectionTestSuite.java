package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import java.util.Arrays;
import java.util.List;

public class CollectionTestSuite {
    @BeforeEach
    public void before() {
        System.out.println("Start test");
    }
    @AfterEach
    public void after() {
        System.out.println("End test");
    }

    @DisplayName("When empty list is created, " +
                "then empty list should be returned")
    @Test
    void testOddNumbersExterminatorEmptyList(){
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList();
        List<Integer> expectedResult = Arrays.asList();
        //When
        List<Integer> result = test.exterminate(numbers);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }

    @DisplayName("When normal list is created, " +
            "then list with even numbers should be returned")
    @Test
    void testOddNumbersExterminatorNormalList(){
        //Given
        OddNumbersExterminator test = new OddNumbersExterminator();
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        List<Integer> expectedResult = Arrays.asList(2,4,6);
        //When
        List<Integer> result = test.exterminate(numbers);
        //Then
        Assertions.assertEquals(expectedResult, result);
    }
}
