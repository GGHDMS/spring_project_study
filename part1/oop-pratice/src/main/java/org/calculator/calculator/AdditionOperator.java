package org.calculator.calculator;

public class AdditionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "+".equals(operator);
    }

    @Override
    public int calculator(PositiveNumber operand1, PositiveNumber operand2) {
        return operand1.getValue()+operand2.getValue();
    }
}
