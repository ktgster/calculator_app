package com.example.demo.model;

public class CalculationResponse {
    private double result;
    private String error;

    public CalculationResponse(double result, String error) {
        this.result = result;
        this.error = error;
    }

    public double getResult() {
        return result;
    }

    public String getError() {
        return error;
    }
}
