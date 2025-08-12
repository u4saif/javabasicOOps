package com.javabasics.lamdas;

import java.util.function.Function;

public class FunctionalDemo {

    public void show(){
        Function<String,Integer> map = str -> str.length();
        var isGreaterThan10 = map.apply("hello Saif ") > 10;
        System.out.println(isGreaterThan10);

//    Question make "key=value" to "{key:value}"

    Function<String,String> addBraces = str -> "{"+str+"}";
    Function<String,String> addColon = str -> str.replace("=",":");

        System.out.println(addBraces.andThen(addColon).apply("key=value"));
    }

}
