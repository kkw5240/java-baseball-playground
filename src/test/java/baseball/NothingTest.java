package baseball;

import baseball.code.ResultCode;
import baseball.model.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NothingTest {
    @Test
    void nothingTest() {
        assertEquals(
                ResultCode.NOTHING,
                Referee.getJudgement(
                        new Ball(1, 3),
                        new Ball(2, 2)
                )
        );
    }
}
