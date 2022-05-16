package study.baseball.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikeTest {
    @Test
    void threeStrike() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 7, 1, 3 };

        assertEquals("3스트라이크", numberBaseball.judge(givenNumbers, inputNumbers));
    }

    @Test
    void twoStrike() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 7, 5, 3 };

        assertEquals("2스트라이크", numberBaseball.judge(givenNumbers, inputNumbers));
    }

    @Test
    void oneStrike() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 9, 5, 3 };

        assertEquals("1스트라이크", numberBaseball.judge(givenNumbers, inputNumbers));
    }
}
