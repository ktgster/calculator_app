package com.example.demo.service;

public class Exponentiation extends Calculation {
    @Override
    public double operation(double x, double y) {
        return Math.pow(x, y);
    }
}
