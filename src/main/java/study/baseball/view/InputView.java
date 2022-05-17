package study.baseball.view;

import study.baseball.model.InningData;

import java.util.Scanner;

public class InputView {

    public int[] getHomeData() {
        System.out.print("숫자를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        String inputNumberString = scanner.nextLine();

        String[] inputNumberStringArray = inputNumberString.split("");
        int[] inputNumbers = new int[inputNumberString.length()];

        for (int i = 0; i < inputNumberStringArray.length; i++) {
            inputNumbers[i] = Integer.parseInt(inputNumberStringArray[i]);
        }

        return inputNumbers;
    }

}
