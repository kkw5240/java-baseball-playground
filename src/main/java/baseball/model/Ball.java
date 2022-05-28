package baseball.model;

import java.util.Objects;

public class Ball {
    private final int position;
    private final int number;

    public Ball(int position, int number) {
        if (!isValidPosition(position)) {
            throw new IllegalArgumentException("순서는 1 ~ 3를 사용합니다.");
        }
        if (!isValidNumber(number)) {
            throw new IllegalArgumentException("숫자는 1 ~ 9를 사용합니다.");
        }

        this.position = position - 1;
        this.number = number;
    }

    static boolean isValidPosition(int position) {
        return isValidIndex(position - 1);
    }
    private static boolean isValidIndex(int i) {
        return i >= 0 && i < 3;
    }
    static boolean isValidNumber(int i) {
        return i > 0 && i < 10;
    }

    public Integer getPosition() {
        return this.position;
    }

    public Integer getNumber() {
        return this.number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ball ball = (Ball) o;
        return position == ball.position && number == ball.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position, number);
    }
}
