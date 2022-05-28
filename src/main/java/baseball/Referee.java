package baseball;

import baseball.code.ResultCode;
import baseball.model.Ball;

public class Referee {

    static ResultCode getJudgement(Ball computerBall, Ball userBall) {
        if (isStrike(computerBall, userBall)) {
            return ResultCode.STRIKE;
        }

        if (isBall(computerBall, userBall)) {
            return ResultCode.BALL;
        }

        return ResultCode.NOTHING;
    }

    private static boolean isStrike(Ball computerBall, Ball userBall) {
        return computerBall.equals(userBall);
    }

    private static boolean isBall(Ball computerBall, Ball userBall) {
        return computerBall.getNumber().equals(userBall.getNumber());
    }

}
