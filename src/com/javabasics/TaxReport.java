package com.javabasics;

public class TaxReport {

    private TaxCalculatorInterface calculator;


    public TaxReport(TaxCalculatorInterface calculator) {
          this.calculator = calculator;
//        calculator = new TaxCalculatorInterface(taxableIncome);
    }


    public void show(){
        double tax = this.calculator.calculateTax();
        System.out.println("Total tax: " + tax);
    }

    //Setter Injection
    public void setCalculator(TaxCalculatorInterface calculator) {
        this.calculator = calculator;
    }


}
