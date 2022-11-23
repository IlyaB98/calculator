package com.example.calculator;

import com.example.calculator.service.CalculatorService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculatorTests {

    CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 3", "4, 4", "5, 5", "6, 6", "7, 7"})
    public void addition(int num1, int num2) {
        Assertions.assertEquals(calculatorService.addition(num1, num2), (num1 + num2));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 3", "4, 4", "5, 5", "6, 6", "7, 7"})
    public void subtraction(int num1, int num2) {
        Assertions.assertEquals(calculatorService.subtraction(num1, num2), (num1 - num2));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 3", "4, 4", "5, 5", "6, 6", "7, 7"})
    public void multiplication(int num1, int num2) {
        Assertions.assertEquals(calculatorService.multiplication(num1, num2), (num1 * num2));
    }

    @ParameterizedTest
    @CsvSource({"1, 1", "2, 2", "3, 3", "4, 4", "5, 5", "6, 6", "7, 7"})
    public void division(int num1, int num2) {
        Assertions.assertEquals(calculatorService.division(num1, num2), (num1 / num2));
    }

}
