package study.baseball.model;

public class ResultView {
    private final ResultDto result;

    public ResultView(ResultDto result) {
        this.result = result;
    }

    @Override
    public String toString() {
        if (result.getBallCount() == 0 && result.getStrikeCount() == 0) {
            return "낫싱";
        }

        return printBallCount() +
                printSpace() +
                printStrikeCount();
    }

    private String printBallCount() {
        if (result.getBallCount() == 0) {
            return "";
        }
        return result.getBallCount() + "볼";
    }

    private String printSpace() {
        if (result.getBallCount() > 0 && result.getStrikeCount() > 0) {
            return " ";
        }
        return "";
    }

    private String printStrikeCount() {
        if (result.getStrikeCount() == 0) {
            return "";
        }
        return result.getStrikeCount() + "스트라이크";
    }

    public void show() {
        System.out.println(this);
    }
}
