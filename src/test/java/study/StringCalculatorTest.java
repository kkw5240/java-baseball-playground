package study;

import org.junit.jupiter.api.Test;
import study.calculator.Calculator;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    void plus() {
        assertThat(3).isEqualTo(
                Calculator.calculate(1, "+", 2)
        );
    }

    @Test
    void minus() {
        assertThat(1).isEqualTo(
                Calculator.calculate(3, "-", 2)
        );
    }

    @Test
    void multiply() {
        assertThat(12).isEqualTo(
                Calculator.calculate(3, "*", 4)
        );
    }

    @Test
    void divide() {
        assertThat(3).isEqualTo(
                Calculator.calculate(12, "/", 4)
        );
    }

    @Test
    void integrate() {
        String input = "2 + 3 * 4 / 2";
        OutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        List<Integer> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String scannedLine = scanner.nextLine();

        Arrays.asList(
                scannedLine.split(" ")
        ).forEach(v -> {
            if (v.matches("\\d+")) {
                numbers.add(Integer.parseInt(v));
            }
            if (v.matches("[+\\-*/]")) {
                operators.add(v);
            }
        });

        int answer = numbers.get(0);
        for (int i=0; i<operators.size(); i++) {
            answer = Calculator.calculate(
                    answer,
                    operators.get(i),
                    numbers.get(i+1)
            );
        }

        assertThat(10).isEqualTo(answer);
    }

}
