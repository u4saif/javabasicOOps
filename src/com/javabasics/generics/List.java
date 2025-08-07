package com.javabasics.generics;

public class List {
    private int count;
    private int[] items = new int[10];

    public void add(int item){
        items[count] = item;
        count++;
    }

    public int getItem(int index){
        return items[index];
    }

}
