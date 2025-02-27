package com.example.demo.service;

public class Minimum extends Calculation {
    @Override
    public double operation(double x, double y) {
        return Math.min(x, y);
    }
}
