package study.baseball.service;

import org.junit.jupiter.api.Test;
import study.baseball.model.ResultDto;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NothingTest {
    @Test
    void nothing() {
        ResultDto expected = ResultDto.builder()
                .ballCount(0)
                .strikeCount(0)
                .build();

        NumberBaseball numberBaseball = new NumberBaseball();

        Integer[] givenNumbers = new Integer[]{7, 1, 3};
        Integer[] inputNumbers = new Integer[]{4, 5, 6};

        ResultDto actual = numberBaseball.judge(givenNumbers, inputNumbers);

        assertEquals(expected, actual);
    }
}
