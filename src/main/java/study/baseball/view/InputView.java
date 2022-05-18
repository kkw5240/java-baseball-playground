package study.baseball.view;


import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public int[] getHomeData() {
        System.out.print("숫자를 입력해 주세요 : ");

        String inputNumberString = getUserInputData();
        if (inputNumberString == null || inputNumberString.length() == 0) {
            throw new IllegalArgumentException("숫자를 입력하지 않았습니다.");
        }

        String[] inputNumberStringArray = inputNumberString.split("");
        int[] inputNumbers = new int[inputNumberString.length()];

        for (int i = 0; i < inputNumberStringArray.length; i++) {
            inputNumbers[i] = Integer.parseInt(inputNumberStringArray[i]);
        }

        return inputNumbers;
    }

    public Boolean isContinue() {
        while(true) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료\n"
                    + "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

            String userInputData = getUserInputData();

            if ("1".equals(userInputData)) {
                return true;
            }

            if ("2".equals(userInputData)) {
                scanner.close();
                return false;
            }
        }
    }

    private String getUserInputData() {
        return scanner.nextLine();
    }
}
