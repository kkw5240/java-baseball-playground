package study.calculator;

import study.calculator.code.Operator;

import java.util.List;

public class Calculator {

    public static Double calculate(Double number1, String operator, Double number2) {
        return Operator.calculate(operator, number1, number2);
    }

    public static Integer calculate(Integer number1, String operator, Integer number2) {
        return Operator.calculate(
                        operator,
                        (double) number1,
                        (double) number2
                )
                .intValue();
    }
}
