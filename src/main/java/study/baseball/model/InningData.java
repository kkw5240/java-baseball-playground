package study.baseball.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class InningData {
    private final Integer[] homeData;
    private final Integer[] awayData;

    public static class Builder {
        private Integer[] homeData;
        private Integer[] awayData;

        public Builder homeData(int[] homeData) {
            this.homeData = new Integer[homeData.length];
            for (int i = 0; i < homeData.length; i++) {
                this.homeData[i] = homeData[i];
            }
            return this;
        }

        public Builder awayData(int[] awayData) {
            this.awayData = new Integer[awayData.length];
            for (int i = 0; i < awayData.length; i++) {
                this.awayData[i] = awayData[i];
            }
            return this;
        }

        public InningData build() {
            validateInningData();

            return new InningData(homeData, awayData);
        }

        private void validateInningData() {
            if (this.homeData.length != 3) {
                throw new IllegalArgumentException("3개의 숫자를 입력해주세요.");
            }
            if (this.awayData.length != 3) {
                throw new IllegalArgumentException("3개의 숫자를 입력해주세요.");
            }

            Set<Integer> homeDataSet = new HashSet<>(Arrays.asList(this.homeData));
            if (homeDataSet.size() != 3) {
                throw new IllegalArgumentException("중복된 숫자를 입력했습니다.");
            }
            Set<Integer> awayDataSet = new HashSet<>(Arrays.asList(this.awayData));
            if (awayDataSet.size() != 3) {
                throw new IllegalArgumentException("중복된 숫자를 입력했습니다.");
            }
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    private InningData(Integer[] homeData, Integer[] awayData) {
        this.homeData = homeData;
        this.awayData = awayData;
    }

    public Integer[] getHomeData() {
        return homeData;
    }

    public Integer[] getAwayData() {
        return awayData;
    }
}
