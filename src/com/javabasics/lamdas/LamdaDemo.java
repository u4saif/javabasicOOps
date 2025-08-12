package com.javabasics.lamdas;

public class LamdaDemo {
      public   String prefix = "Its Prefix: ";
//    public static void show(){
//        greet(new ConsolePrinter());
//    }

//    public static void show(){
//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println("Anonimus Print "+message);
//            }
//        });
//    }

    //Method Refrence Example
    public   void show(){
//        greet((message)-> System.out.println("LambdasFunc "+prefix+message+this));
        greet(System.out::println);
    }
//    public   void show(){
//        greet((message)-> System.out.println("LambdasFunc "+prefix+message+this));
//    }
    private static void greet(Printer p){
       p.print("Hello saif from LambdasDemoClass");
    }
}
