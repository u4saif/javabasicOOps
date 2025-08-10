package com.javabasics.collection;

public class Customer implements Comparable<Customer>{
    private String name;

    public String getEmail() {
        return email;
    }

    private  String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return  name + " : " + email;
    }

    @Override
    public int compareTo(Customer other) {
        return name.compareTo(other.name);
    }

}