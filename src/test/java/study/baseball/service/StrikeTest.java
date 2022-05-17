package study.baseball.service;

import org.junit.jupiter.api.Test;
import study.baseball.model.ResultDto;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikeTest {
    @Test
    void threeStrike() {
        ResultDto expected = ResultDto.builder()
                .ballCount(0)
                .strikeCount(3)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 7, 1, 3 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void twoStrike() {
        ResultDto expected = ResultDto.builder()
                .ballCount(0)
                .strikeCount(2)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 7, 5, 3 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void oneStrike() {
        ResultDto expected = ResultDto.builder()
                .ballCount(0)
                .strikeCount(1)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 9, 5, 3 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }
}
