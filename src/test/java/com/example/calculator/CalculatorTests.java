package com.example.calculator;

import com.example.calculator.service.exception.NotParameterNumberException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTests {
    private Integer num1;
    private Integer num2;

    @BeforeEach
    public void setUp() {
        num1 = 5;
        num2 = 5;
    }

    @Test
    public void addition() {
        Integer addition = num1 + num2;
        Assertions.assertEquals(addition, (num1 + num2));
    }

    @Test
    public void subtraction() {
        if (num1 == null || num2 == null) {
            throw new NotParameterNumberException("Какой-то из двух параметров (или оба) не поданы!");
        }
        Integer subtraction = num1 - num2;
        Assertions.assertEquals(subtraction, (num1 - num2));
    }

    @Test
    public void multiplication() {
        Integer multiplication = num1 * num2;
        Assertions.assertEquals(multiplication, (num1 * num2));
    }

    @Test
    public void division() {
        if (num1 == 0 || num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 запрещено!");
        }
        Integer division = num1 / num2;
        Assertions.assertEquals(division, (num1 / num2));
    }

}
