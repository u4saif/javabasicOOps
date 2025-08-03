package com.javabasics;

public class TaxCalculator2024 implements TaxCalculatorInterface{
    private double taxableIncome;

    public TaxCalculator2024(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    //Tightly coupled
    @Override
    public double calculateTax(){
        return taxableIncome*0.4;
    }
}
