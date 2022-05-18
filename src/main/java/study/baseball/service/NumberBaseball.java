package study.baseball.service;

import study.baseball.model.InningData;
import study.baseball.model.ResultDto;
import study.baseball.model.ResultView;
import study.baseball.view.InputView;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberBaseball {

    private Boolean isPlaying;

    public ResultDto judge(InningData inningData) {
        return this.judge(inningData.getHomeData(), inningData.getAwayData());
    }

    public ResultDto judge(Integer[] givenNumbers, Integer[] inputNumbers) {
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
                .build();
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

    public InningData getInningData(int[] homeData, int[] awayData) {
        return InningData.builder()
                .homeData(homeData)
                .awayData(awayData)
                .build();
    }


    public void play() {
        this.isPlaying = true;

        int[] awayData = getAwayData();

        do {
            inning(awayData);

        } while (isPlaying());
    }

    private int[] getAwayData() {
        Set<Integer> awayDataSet = new HashSet<>();
        Random rand = new Random();
        while (awayDataSet.size() <= 2) {
            awayDataSet.add(rand.nextInt(9) + 1);
        }

        int[] awayData = new int[3];
        int i = 0;
        for (Integer data : awayDataSet) {
            awayData[i++] = data;
        }

        return awayData;
    }

    public void inning(int[] awayData) {
        try {
            InputView inputView = new InputView();

            InningData inningData = getInningData(
                    new InputView().getHomeData(),
                    awayData
            );

            ResultDto result = this.judge(inningData);

            ResultView resultView = new ResultView(result);
            resultView.show();
            if (result.getStrikeCount() == 3) {
                if (inputView.isContinue()) {
                    play();
                    return;
                }
                isPlaying = false;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
