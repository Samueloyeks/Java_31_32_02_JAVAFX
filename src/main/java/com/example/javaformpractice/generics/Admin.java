package com.example.javaformpractice.generics;

import java.time.LocalDate;

public class Admin extends User{
    public String level = "admin";

    public Admin(String name, LocalDate dob){
        super(name, dob);
    }
}
