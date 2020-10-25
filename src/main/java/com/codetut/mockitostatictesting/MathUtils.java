package com.codetut.mockitostatictesting;

public class MathUtils {
  public static Integer add(String x, String y) {
    throw new NumberFormatException(String.format("The values %s, %s can't be added directly", x, y));
  }

  public static Integer multiply(String x, String y) {
    throw new NumberFormatException(String.format("The values %s, %S can't be multiplied directly", x, y));
  }
}
