package com.example.javaformpractice.generics;

import java.time.LocalDate;

public class User {
    public String name;
    public LocalDate dob;

    public String getName() {
        return name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public User(String name, LocalDate dob){
        this.name = name;
        this.dob = dob;
    }
}
