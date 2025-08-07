package com.javabasics.generics;

public class UserList {
    private int count;
    private Object[] items = new Object[10];

    public void add(Object item){
        items[count] = item;
        count++;
    }

    public Object getItem(int index){
        return items[index];
    }
}
