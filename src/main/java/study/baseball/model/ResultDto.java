package study.baseball.model;

public class ResultDto {
    private final Integer ballCount;
    private final Integer strikeCount;

    public static class Builder {
        private Integer ballCount;
        private Integer strikeCount;

        public Builder ballCount(Integer ballCount) {
            this.ballCount = ballCount;
            return this;
        }

        public Builder strikeCount(Integer strikeCount) {
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

    @Override
    public String toString() {
        if (ballCount == 0 && strikeCount == 0) {
            return "낫싱";
        }

        return printBallCount() +
                printSpace() +
                printStrikeCount();
    }

    private String printBallCount() {
        if (ballCount == 0) {
            return "";
        }
        return ballCount + "볼";
    }

    private String printSpace() {
        if (ballCount > 0 && strikeCount > 0) {
            return " ";
        }
        return "";
    }

    private String printStrikeCount() {
        if (strikeCount == 0) {
            return "";
        }
        return strikeCount + "스트라이크";
    }

    private ResultDto(Integer ballCount, Integer strikeCount) {
        this.ballCount = ballCount;
        this.strikeCount = strikeCount;
    }
}
