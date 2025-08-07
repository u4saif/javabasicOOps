package com.javabasics.generics;

public class GenericList <T> {

    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T value){
        items[count++] = value;
    }

    public T getValue(int index){
        return items[index];
    }

    public void add(int i) {
    }
}
