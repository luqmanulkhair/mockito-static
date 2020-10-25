package com.codetut.mockitostatictesting;

import static java.util.OptionalInt.of;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mockStatic;
import static org.mockito.Mockito.when;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockedStatic;

public class CalculatorTest {
  static MockedStatic mathUtilityMockStatic;
  public static final Integer addOutput = 3;
  public static final Integer multiplyOutput = 2;

  @BeforeClass
  public static void prepareResources() {
    mathUtilityMockStatic = mockStatic(MathUtils.class, "MathUtilityMockStatic");
  }

  @AfterClass
  public static void closeResources() {
    mathUtilityMockStatic.close();
  }

  @Test
  public void calculateAdd()  {
    when(MathUtils.add(anyString(), anyString())).thenReturn(addOutput);
    Calculator calculator = new Calculator();
    assertEquals(of(calculator.calculate("1+2")), of(addOutput));
  }

  @Test
  public void calculateMultiply()  {
    when(MathUtils.multiply(anyString(), anyString())).thenReturn(multiplyOutput);
    Calculator calculator = new Calculator();
    assertEquals(of(calculator.calculate("1x2")), of(multiplyOutput));
  }
}
