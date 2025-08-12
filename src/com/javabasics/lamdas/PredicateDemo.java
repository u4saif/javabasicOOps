package com.javabasics.lamdas;

import java.util.function.Predicate;

public class PredicateDemo {

    public void show(){

        Predicate<String> isLongerthan5 = (str) -> str.length() > 5;
        Predicate<String> hasbrance = (str) -> str.startsWith("{") || str.endsWith("}");
        System.out.println(isLongerthan5.test("helf"));
        System.out.println(hasbrance.test("{abceee"));
    }
}
