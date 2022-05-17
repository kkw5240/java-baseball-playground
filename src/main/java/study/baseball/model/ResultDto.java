package study.baseball.model;

import java.util.Arrays;
import java.util.Objects;

public class ResultDto {
    private final int ballCount;
    private final int strikeCount;

    public static class Builder {
        private int ballCount;
        private int strikeCount;

        public Builder ballCount(int ballCount) {
            this.ballCount = ballCount;
            return this;
        }

        public Builder strikeCount(int strikeCount) {
            this.strikeCount = strikeCount;
            return this;
        }

        public ResultDto build() {
            return new ResultDto(this.ballCount, this.strikeCount);
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private ResultDto(Integer ballCount, Integer strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }

    public Integer getBallCount() {
        return ballCount;
    }

    public Integer getStrikeCount() {
        return strikeCount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof ResultDto)) {
            return false;
        }

        ResultDto ResultDto = (ResultDto) obj;

        return ResultDto.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(ballCount, strikeCount);
    }
}
