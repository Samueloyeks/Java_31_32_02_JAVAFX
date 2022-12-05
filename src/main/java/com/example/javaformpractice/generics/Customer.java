package com.example.javaformpractice.generics;

import java.time.LocalDate;

public class Customer extends User{
    public String userType = "customer";

    public Customer(String name, LocalDate dob){
        super(name, dob);
    }
}
