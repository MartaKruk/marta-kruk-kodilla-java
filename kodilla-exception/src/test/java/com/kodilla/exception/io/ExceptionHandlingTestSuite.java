package com.kodilla.exception.io;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionHandlingTestSuite {

    private SecondChallenge secondChallenge = new SecondChallenge();

    @Test
    void testDoesNotThrowX() {
        // when & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.9,1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.1,1))
        );
    }

    @Test
    void testDoesNotThrowY() {
        // when & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1.49)),
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1,1.51))
        );
    }

    @Test
    void testThrowsX() {
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2,1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1,1)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9,1))
        );
    }

    @Test
    void testThrowsY() {
        // when & then
        assertAll(
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1,1.5))
        );
    }

}
