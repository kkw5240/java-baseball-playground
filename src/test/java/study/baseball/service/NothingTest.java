package study.baseball.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NothingTest {
    @Test
    void nothing() {
        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{7, 1, 3};
        int[] inputNumbers = new int[]{4, 5, 6};

        assertEquals("낫싱", numberBaseball.judge(givenNumbers, inputNumbers));
    }
}
