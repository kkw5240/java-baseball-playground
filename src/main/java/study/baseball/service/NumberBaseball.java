package study.baseball.service;

public class NumberBaseball {
    public String judge(int[] givenNumbers, int[] inputNumbers) {
        int result = 0;
        for (int i = 0; i < givenNumbers.length; i++) {
            result += strike(givenNumbers[i], inputNumbers[i]);
        }
        return result + "스트라이크";
    }

    private int strike(int givenNumber, int inputNumber) {
        if (givenNumber == inputNumber) {
            return 1;
        }
        return 0;
    }
}
