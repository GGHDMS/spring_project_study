package org.calculator;

import org.calculator.calculator.*;

import java.util.List;

public class Calculator {
    private static final List<NewArithmeticOperator> arithmeticOperators =
            List.of(
                    new AdditionOperator(),
                    new SubtractionOperator(),
                    new MultiplicationOperator(),
                    new DivisionOperator()
            );

    public static int calculate(PositiveNumber operand1, String operator, PositiveNumber operand2){
//        if ("+".equals(calculator)) {
//            return operand1 + operand2;
//        } else if ("-".equals(calculator)) {
//            return operand1 - operand2;
//        } else if ("*".equals(calculator)){
//            return operand1 * operand2;
//        } else if ("/".equals(calculator)) {
//            return operand1 / operand2;
//        }
//        return 0;
//        return ArithmeticOperator.calculate(operand1, operator, operand2);
        return arithmeticOperators.stream()
                .filter(c -> c.supports(operator))
                .map(arithmeticOperator -> arithmeticOperator.calculator(operand1, operand2))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("올바른 사칙연산이 아닙니다"));
    }
}
