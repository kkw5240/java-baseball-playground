package study.baseball.service;

import org.junit.jupiter.api.Test;
import study.baseball.model.ResultDto;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {
    @Test
    void oneBall() {
        ResultDto expected = ResultDto.builder()
                .ballCount(1)
                .strikeCount(0)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 1, 2, 4 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void twoBall() {
        ResultDto expected = ResultDto.builder()
                .ballCount(2)
                .strikeCount(0)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 1, 2, 7 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void oneBallOneStrike() {
        ResultDto expected = ResultDto.builder()
                .ballCount(1)
                .strikeCount(1)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 1, 2, 3 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }

    @Test
    void twoBallOneStrike() {
        ResultDto expected = ResultDto.builder()
                .ballCount(2)
                .strikeCount(1)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{ 7, 1, 3 };
        Integer[] inputNumbers = new Integer[]{ 3, 1, 7 };

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }
}
