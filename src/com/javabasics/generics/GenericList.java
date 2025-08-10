package com.javabasics.generics;

import java.util.Iterator;

public class GenericList <T> implements Iterable{

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

    @Override
    public Iterator iterator() {
        return new ListIterator(this);
    }


    private class ListIterator implements Iterator {
        private GenericList<T> list ;
        private int index;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }


        @Override
        public boolean hasNext() {
            return (index < list.count);
        }

        @Override
        public Object next() {
            return list.items[index++];
        }
    }
}
