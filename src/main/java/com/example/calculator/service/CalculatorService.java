package com.example.calculator.service;

import com.example.calculator.service.exception.NotParameterNumberException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public String greeting() {
        return "Добро пожаловать в калькулятор";
    }

    public String addition(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotParameterNumberException("Какой-то из двух параметров (или оба) не поданы!");
        }
        return num1 + " + " + num2 + " = " + (num1 + num2);
    }

    public String subtraction(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotParameterNumberException("Какой-то из двух параметров (или оба) не поданы!");
        }
        return num1 + " - " + num2 + " = " + (num1 - num2);
    }

    public String multiplication(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotParameterNumberException("Какой-то из двух параметров (или оба) не поданы!");
        }
        return num1 + " * " + num2 + " = " + (num1 * num2);
    }

    public String division(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            throw new NotParameterNumberException("Какой-то из двух параметров (или оба) не поданы!");
        }
        if (num1 == 0 || num2 == 0) {
            throw new IllegalArgumentException("Деление на 0 запрещено!");
        }
        return num1 + " / " + num2 + " = " + (num1 / num2);
    }
}
