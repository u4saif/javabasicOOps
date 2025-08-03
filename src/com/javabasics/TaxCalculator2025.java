package com.javabasics;

public class TaxCalculator2025 implements TaxCalculatorInterface{
    private double taxableIncome;

    public TaxCalculator2025(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    //Tightly coupled
    @Override
    public double calculateTax(){
        return taxableIncome*0.3;
    }
}
