package study.baseball.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {
    @Test
    void oneBall() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 1, 2, 4 };

        assertEquals("1볼", numberBaseball.judge(givenNumbers, inputNumbers));
    }

    @Test
    void twoBall() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 1, 2, 7 };

        assertEquals("2볼", numberBaseball.judge(givenNumbers, inputNumbers));
    }

    @Test
    void oneBallOneStrike() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 1, 2, 3 };

        assertEquals("1볼 1스트라이크", numberBaseball.judge(givenNumbers, inputNumbers));
    }

    @Test
    void twoBallOneStrike() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        int[] inputNumbers = new int[]{ 3, 1, 7 };

        assertEquals("2볼 1스트라이크", numberBaseball.judge(givenNumbers, inputNumbers));
    }
}
