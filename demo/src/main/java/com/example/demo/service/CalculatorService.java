package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    // Existing operations
    private final Addition addition = new Addition();
    private final Subtraction subtraction = new Subtraction();
    private final Multiplication multiplication = new Multiplication();
    private final Division division = new Division();
    private final Exponentiation exponentiation = new Exponentiation();

    // New operations
    private final Modulus modulusOperation = new Modulus();
    private final Maximum maximumOperation = new Maximum();
    private final Minimum minimumOperation = new Minimum();
    private final Average averageOperation = new Average();
    private final AbsDifference absDifferenceOperation = new AbsDifference();

    public double add(double a, double b) {
        return addition.operation(a, b);
    }

    public double subtract(double a, double b) {
        return subtraction.operation(a, b);
    }

    public double multiply(double a, double b) {
        return multiplication.operation(a, b);
    }

    public double divide(double a, double b) {
        return division.operation(a, b);
    }

    public double exponentiate(double a, double b) {
        return exponentiation.operation(a, b);
    }

    public double modulus(double a, double b) {
        return modulusOperation.operation(a, b);
    }

    public double maximum(double a, double b) {
        return maximumOperation.operation(a, b);
    }

    public double minimum(double a, double b) {
        return minimumOperation.operation(a, b);
    }

    public double average(double a, double b) {
        return averageOperation.operation(a, b);
    }

    public double absDifference(double a, double b) {
        return absDifferenceOperation.operation(a, b);
    }
}
