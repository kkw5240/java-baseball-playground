package baseball;

import baseball.code.ResultCode;
import baseball.model.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BallTest {
    @Test
    void ballTest() {
        assertEquals(
                ResultCode.BALL,
                Referee.getJudgement(
                        new Ball(1, 2),
                        new Ball(2, 2)
                )
        );
    }
}
