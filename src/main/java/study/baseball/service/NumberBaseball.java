package study.baseball.service;

import study.baseball.model.ResultDto;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberBaseball {
    public String judge(Integer[] givenNumbers, int[] inputNumbers) {
        int ballCount = 0;
        int strikeCount = 0;

        for (int i = 0; i < givenNumbers.length; i++) {
            if (isStrike(givenNumbers[i], inputNumbers[i])) {
                strikeCount++;
                continue;
            }

            if (isBall(givenNumbers, inputNumbers[i])) {
                ballCount++;
            }
        }

        return ResultDto.builder()
                .ballCount(ballCount)
                .strikeCount(strikeCount)
                .build()
                .toString();
    }

    private Boolean isBall(Integer[] givenNumbers, int inputNumber) {
        Set<Integer> givenNumberSet = new HashSet<>(Arrays.asList(givenNumbers));
        return givenNumberSet.contains(inputNumber);
    }

    private Boolean isStrike(int givenNumber, int inputNumber) {
        return givenNumber == inputNumber;
    }
}
