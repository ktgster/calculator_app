package com.example.demo.service;

public class Average extends Calculation {
    @Override
    public double operation(double x, double y) {
        return (x + y) / 2.0;
    }
}
