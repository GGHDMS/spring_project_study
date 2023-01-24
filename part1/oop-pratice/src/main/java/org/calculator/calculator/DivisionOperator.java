package org.calculator.calculator;

public class DivisionOperator implements NewArithmeticOperator {
    @Override
    public boolean supports(String operator) {
        return "/".equals(operator);
    }

    @Override
    public int calculator(PositiveNumber operand1, PositiveNumber operand2) {
//        if (operand2.getValue() == 0){ PositiveNumber 사용하면 할 필요가 없다.
//            throw new IllegalArgumentException("0으로는 나눌수 없습니다");
//        }
        return operand1.getValue() / operand2.getValue();
    }
}
