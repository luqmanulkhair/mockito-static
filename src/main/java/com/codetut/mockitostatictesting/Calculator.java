package com.codetut.mockitostatictesting;

public class Calculator {
  public Integer calculate(String input) {
    Integer output;
    if (input.contains("+")) {
      String[] operands = input.split("\\+");
      validateOperands(operands);
      output = MathUtils.add(operands[0], operands[1]);
    } else if (input.contains("x")) {
      String[] operands = input.split("x");
      validateOperands(operands);
      output = MathUtils.multiply(operands[0], operands[1]);
    } else {
      throw new ArithmeticException("Operator missing, possible operators: x, +");
    }
    return output;
  }

  private void validateOperands(String[] operands) {
    if (operands.length != 2) throw new ArithmeticException("Only 2 operands are currently supported: 1+2");
  }
}
