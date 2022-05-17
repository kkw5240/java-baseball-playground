package study.baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import study.baseball.model.InningData;
import study.baseball.model.ResultDto;
import study.baseball.service.NumberBaseball;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntegrationTest {
    NumberBaseball numberBaseball;

    @BeforeEach
    void setUp() {
        numberBaseball = new NumberBaseball();
    }

    @Test
    void judge() {
        ResultDto expected = ResultDto.builder()
                .ballCount(2)
                .strikeCount(1)
                .build();
        ResultDto actual = numberBaseball.judge(
                InningData.builder()
                        .awayData(new int[]{7, 1, 3})
                        .homeData(new int[]{3, 1, 7})
                        .build()
        );

        assertEquals(expected, actual);
    }

    @Test
    void isPlaying() {

    }

    @Test
    void inning() {

    }

    @Test
    void getInningData() {

    }

    @Test
    void play() {

    }
}
