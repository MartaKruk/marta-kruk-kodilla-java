package com.kodilla;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RPSTestSuite {

    @Test
    void testRPSRules() {
        //Given
        int player1Move = 1;
        int player2Move = 2;
        //When
        RPSRules rpsRules = new RPSRules();
        int winner = rpsRules.whoWon(player1Move, player2Move);
        //Then
        assertEquals(2,winner);
    }

    @Test
    void testIsNaturalNumber() {
        //Given
        boolean output = InputOutputController.isNaturalNumber("text");
        boolean output2 = InputOutputController.isNaturalNumber("2");
        //When&Then
        assertFalse(output);
        assertTrue(output2);
    }
}
