package baseball;

import baseball.code.ResultCode;
import baseball.model.Ball;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrikeTest {
    @Test
    void strikeTest() {
        assertEquals(
                ResultCode.STRIKE,
                Referee.getJudgement(
                        new Ball(1, 1),
                        new Ball(1, 1)
                )
        );
    }
}
