package study.baseball;

import study.baseball.service.NumberBaseball;

public class Game {
    public static void main(String[] args) {
        NumberBaseball numberBaseball = new NumberBaseball();

        do {
            numberBaseball.play();

        } while (numberBaseball.isPlaying());
    }
}
