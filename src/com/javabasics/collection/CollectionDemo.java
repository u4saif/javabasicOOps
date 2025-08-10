package com.javabasics.collection;

import java.util.*;

public class CollectionDemo {

//    Collection<String> collectionSample = new ArrayList<>();
      List<Object> collectionSample = new ArrayList<>();


    public void show(){
        collectionSample.add("ok");
        collectionSample.add("hi");
        Collections.addAll(collectionSample,"Saif","!!");
        var sample2 = collectionSample.toArray();
        sample2[3]="sasa";
        collectionSample.remove("ok!");
        System.out.println(sample2[3]);
        for(var item : sample2)
            System.out.print(item+"\t");
        System.out.println(collectionSample.subList(0,2));
        System.out.println(collectionSample);
    }

}
