package baseball.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberBallTest {
    @Test
    void validPositionTest() {
        assertAll(
                () -> assertTrue(Ball.isValidPosition(1)),
                () -> assertTrue(Ball.isValidPosition(3)),
                () -> assertFalse(Ball.isValidPosition(0)),
                () -> assertFalse(Ball.isValidPosition(4)),
                () -> assertFalse(Ball.isValidPosition(-1))
        );
    }

    @Test
    void validNumberTest() {
        assertAll(
                () -> assertTrue(Ball.isValidNumber(1)),
                () -> assertTrue(Ball.isValidNumber(9)),
                () -> assertFalse(Ball.isValidNumber(0)),
                () -> assertFalse(Ball.isValidNumber(10)),
                () -> assertFalse(Ball.isValidNumber(-1))
        );
    }
}