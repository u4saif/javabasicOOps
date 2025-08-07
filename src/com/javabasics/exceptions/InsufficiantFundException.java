package com.javabasics.exceptions;

public class InsufficiantFundException  extends Exception{

    public InsufficiantFundException(){
        super("Insufficient Account Balance.");
    }
    public InsufficiantFundException(String message) {
        super(message);
    }
}
