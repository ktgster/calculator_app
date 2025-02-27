package com.example.demo.service;

public class AbsDifference extends Calculation {
    @Override
    public double operation(double x, double y) {
        return Math.abs(x - y);
    }
}
