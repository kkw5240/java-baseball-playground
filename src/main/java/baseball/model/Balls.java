package baseball.model;

import java.util.ArrayList;
import java.util.List;

public class Balls {
    private final List<Ball> balls;

    public Balls(List<Integer> balls) {
        if (isValidSizeOfBalls(balls)) {
            throw new IndexOutOfBoundsException();
        }

        this.balls = mapBalls(balls);
    }

    private List<Ball> mapBalls(List<Integer> balls) {
        List<Ball> mapBalls = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            mapBalls.add(new Ball(i + 1, balls.get(i)));
        }
        return mapBalls;
    }

    private boolean isValidSizeOfBalls(List<Integer> balls) {
        return balls.size() != 3;
    }
}
