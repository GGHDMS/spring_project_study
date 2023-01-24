package org.calculator.calculator;

public interface NewArithmeticOperator {
    boolean supports(String operator);
    int calculator(PositiveNumber operand1, PositiveNumber operand2);

}
