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
}
