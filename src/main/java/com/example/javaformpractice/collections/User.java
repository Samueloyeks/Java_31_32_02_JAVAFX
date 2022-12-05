package com.example.javaformpractice.collections;

import java.util.ArrayList;
import java.util.List;

public class User {
    public String name;

    public static List<User> user = new ArrayList<>();

    public String getName() {
        return name;
    }

    public String toString(){
        return "User { name: "+name+ " }";
    }


    public User(String name){
        this.name = name;
    }

    public static void main(String[] args){
        Box<Integer> newBoxedUser = new Box<>();
    }
}

/*
    Create your own implementation of a generic map ==> put, get // Pair<String, Integer> = new Pair<>();
 */
