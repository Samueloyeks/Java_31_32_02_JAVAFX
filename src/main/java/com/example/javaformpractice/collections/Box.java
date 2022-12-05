package com.example.javaformpractice.collections;

public class Box<T extends Number & Comparable<T>> {
    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

/*
    Create a generic for a website user which accepts 3 different types of users (Admin, Customer, SuperAdmin) only these 3.

 */
