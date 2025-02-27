package com.example.demo.service;

public class Maximum extends Calculation {
    @Override
    public double operation(double x, double y) {
        return Math.max(x, y);
    }
}
