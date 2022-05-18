package study.baseball.model;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class InningData {
    private final Integer[] homeData;
    private final Integer[] awayData;

    public static class Builder {
        private Integer[] homeData;
        private Integer[] awayData;

        public static final int MIN_VALUE = 1;
        public static final int MAX_VALUE = 9;

        public Builder homeData(int[] homeData) {
            this.homeData = new Integer[homeData.length];
            for (int i = 0; i < homeData.length; i++) {
                validateNumber(homeData[i]);
                this.homeData[i] = homeData[i];
            }
            return this;
        }

        public Builder awayData(int[] awayData) {
            this.awayData = new Integer[awayData.length];
            for (int i = 0; i < awayData.length; i++) {
                validateNumber(awayData[i]);
                this.awayData[i] = awayData[i];
            }
            return this;
        }

        private void validateNumber(int number) {
            if (number < MIN_VALUE || number > MAX_VALUE) {
                throw new IllegalArgumentException("1~9의 숫자만 사용 가능합니다.");
            }
        }

        public InningData build() throws IllegalArgumentException {
            validateInningData();

            return new InningData(homeData, awayData);
        }

        private void validateInningData() throws IllegalArgumentException {
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof InningData)) {
            return false;
        }

        InningData inningData = (InningData) obj;

        return inningData.hashCode() == this.hashCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                Arrays.hashCode(homeData),
                Arrays.hashCode(awayData)
        );
    }
}
