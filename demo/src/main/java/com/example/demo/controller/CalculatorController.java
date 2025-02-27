package com.example.demo.controller;

import com.example.demo.model.CalculationResponse;
import com.example.demo.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class CalculatorController {

    private final CalculatorService calculatorService;

    @Autowired
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculate")
    public CalculationResponse calculate(@RequestParam String operation,
                                         @RequestParam double a,
                                         @RequestParam double b) {
        double result = 0;
        String error = null;

        switch (operation) {
            case "add":
                result = calculatorService.add(a, b);
                break;
            case "sub":
                result = calculatorService.subtract(a, b);
                break;
            case "mul":
                result = calculatorService.multiply(a, b);
                break;
            case "div":
                if (b == 0) {
                    error = "Division by zero is not allowed.";
                } else {
                    result = calculatorService.divide(a, b);
                }
                break;
            case "exp":
                result = calculatorService.exponentiate(a, b);
                break;
            case "mod":
                result = calculatorService.modulus(a, b);
                break;
            case "max":
                result = calculatorService.maximum(a, b);
                break;
            case "min":
                result = calculatorService.minimum(a, b);
                break;
            case "avg":
                result = calculatorService.average(a, b);
                break;
            case "absdiff":
                result = calculatorService.absDifference(a, b);
                break;
            default:
                error = "Invalid operation entered.";
                break;
        }
        return new CalculationResponse(result, error);
    }
}
