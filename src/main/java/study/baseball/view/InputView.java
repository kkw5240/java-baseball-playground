package study.baseball.view;

import java.util.Scanner;

public class InputView {
    public Integer[] getInningData() {
        System.out.print("숫자를 입력해 주세요 : ");

        Scanner scanner = new Scanner(System.in);
        String inputNumberString = scanner.nextLine();

        String[] inputNumberStringArray = inputNumberString.split("");
        Integer[] inputNumbers = new Integer[inputNumberString.length()];

        for (int i = 0; i < inputNumberStringArray.length; i++) {
            inputNumbers[i] = Integer.parseInt(inputNumberStringArray[i]);
        }
        return inputNumbers;
    }
}
