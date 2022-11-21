package com.example.calculator.controller;

import com.example.calculator.service.CalculatorService;
import com.example.calculator.service.exception.NotParameterNumberException;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Qualifier("/calculator")
public class CalculatorController {

    private CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greeting() {
        return calculatorService.greeting();
    }

    @GetMapping("/plus")
    public String addition(@RequestParam Integer num1, Integer num2) throws NotParameterNumberException {
        return calculatorService.addition(num1, num2);
    }

    @GetMapping("/minus")
    public String subtraction(@RequestParam Integer num1, Integer num2) throws NotParameterNumberException {
        return calculatorService.subtraction(num1, num2);
    }

    @GetMapping("/multiply")
    public String multiplication(@RequestParam Integer num1, Integer num2) throws NotParameterNumberException {
        return calculatorService.multiplication(num1, num2);
    }

    @GetMapping("/divide")
    public String division(@RequestParam Integer num1, Integer num2) throws NotParameterNumberException, DivisionByZeroException {
        return calculatorService.division(num1, num2);
    }
}
