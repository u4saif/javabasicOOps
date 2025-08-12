package com.javabasics;

import com.javabasics.collection.CollectionDemo;
import com.javabasics.collection.Customer;
import com.javabasics.collection.EmailComparator;
import com.javabasics.exceptions.ExceptionDemo;
import com.javabasics.generics.GenericList;
import com.javabasics.generics.User;
import com.javabasics.generics.UserList;
import com.javabasics.lamdas.ConsolePrinter;
import com.javabasics.lamdas.ConsumerDemo;
import com.javabasics.lamdas.LamdaDemo;
import com.javabasics.lamdas.SupplierDemo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Java Inheritance!");

//        UIControl control = new UIControl();
//        control.disable();
//        control.enable();
//       System.out.println(control.isEnable());


//        UIControl control = new TextBox();
//        control.disable();
//        control.enable();
//        System.out.println(control.isEnable());

//          UIControl box1 = new TextBox("Box1");
//          UIControl box2 =  box1 ; //new TextBox();

//        System.out.println(box1.equals(box2));
//        System.out.println(box1.toString());
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//
//        show(box1);

        Point point1 = new Point(1,2);
        Point point2 = new Point(1,2);
        System.out.println(point2.equals(point1));
        System.out.println(point1.hashCode());
        System.out.println(point2.hashCode());


        /* Polymorphism */
//     for (UIControl control : controls){
//        if control is TextBox
//                rendertextbox
//        if control is Checkbox
//                renderCheckbox
//    }
        UIControl[] controls = { new TextBox(), new CheckBox()};
        for(var control: controls)
            control.render();

//        Constructor Injection DI
        var calculator  = new TaxCalculator2024(100_000);
        var report = new TaxReport(calculator);
        report.show();

        ExceptionDemo exceptionDemo = new ExceptionDemo();
        try {
        exceptionDemo.show();
        }catch (Exception e){
//             e.printStackTrace();
        }

        UserList numberList = new UserList();
        numberList.add('6');
        numberList.add("sd");
        Object value = numberList.getItem(1);
        System.out.println("Item at index 1:-> " + value.toString());

        GenericList<String> numberitems = new GenericList<>();
        numberitems.add("22");
        System.out.println(numberitems.getValue(0));


        var mylist = new GenericList<String>();
        var mylistIteraor = mylist.iterator();
        mylist.add("aa");
        mylist.add("bb");
        while (mylistIteraor.hasNext()){
            System.out.println(mylistIteraor.next());
        }
//        System.out.println(mylist.getValue(0));

        var cexample = new CollectionDemo();
        cexample.show();
        var customerExample2 = new Customer("b","c2");
        var customerExample1 = new Customer("a","b3");
        var customerExample3 = new Customer("c","a1");

        List<Customer> clist = new ArrayList<>();
        clist.add(customerExample2);
        clist.add(customerExample1);
        clist.add(customerExample3);
        System.out.println(clist);
        Collections.sort(clist, new EmailComparator());
        System.out.println("AfterSort "+clist);


        Queue<String> queExp = new ArrayDeque<>();
        queExp.add("saif");
        queExp.add("ayat");
        queExp.add("xebia");
        var front = queExp.peek();
        var frontX = queExp.element();

        System.out.println(front);

        Map<String,Customer> mapExp = new HashMap<>();
        mapExp.put(customerExample2.getEmail(),customerExample2);
        mapExp.put(customerExample3.getEmail(),customerExample3);
        mapExp.put(customerExample1.getEmail(),customerExample1);
        for(var custKey : mapExp.keySet())
            System.out.println(custKey);

        System.out.println(mapExp.get("b3"));

        var lamdaDemo = new LamdaDemo();
        lamdaDemo.show();

        var consumerFn = new ConsumerDemo();
        consumerFn.showConsumer();

        var supplier = new SupplierDemo();
        supplier.show();
    }

    //Upcasting Down-casting
    public static void show(UIControl control){
        System.out.println(control);
    }




}