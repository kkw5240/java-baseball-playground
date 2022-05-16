package study.baseball.service;

import study.baseball.model.ResultDto;
import study.baseball.view.InputView;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class NumberBaseball {

    private Boolean isPlaying;

    public String judge(Integer[] givenNumbers, Integer[] inputNumbers) {
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

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void play() {
        this.isPlaying = true;

        InputView inputView = new InputView();
        Integer[] inputNumbers = inputView.getInningData();

        this.judge(new Integer[]{7, 1, 3}, inputNumbers);

        this.isPlaying = false;
    }

}
