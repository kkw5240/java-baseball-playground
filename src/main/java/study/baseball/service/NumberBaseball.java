package study.baseball.service;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberBaseball {
    public String judge(Integer[] givenNumbers, int[] inputNumbers) {
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < givenNumbers.length; i++) {
            ballCount += ball(givenNumbers, inputNumbers[i]);
            strikeCount += strike(givenNumbers[i], inputNumbers[i]);
        }

        return ballCount + "볼"
                + strikeCount + "스트라이크";
    }

    private int ball(Integer[] givenNumbers, int inputNumber) {
        Set<Integer> givenNumberSet = new HashSet<>(Arrays.asList(givenNumbers));
        if (givenNumberSet.contains(inputNumber)) {
            return 1;
        }
        return 0;
    }

    private int strike(int givenNumber, int inputNumber) {
        if (givenNumber == inputNumber) {
            return 1;
        }
        return 0;
    }
}
