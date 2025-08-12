package com.javabasics.lamdas;

import java.util.function.Supplier;

public class SupplierDemo {

    public void show(){

        Supplier<Double> getnum = ()-> Math.random();
        Supplier<Integer> getPercent = ()-> (int) (Math.random()*100);
        var ran = getnum.get();
        var ran2 = getPercent.get();
        System.out.println(ran);
        System.out.println(ran2);
    }
}
