package com.example.javaformpractice.generics;

import java.time.LocalDate;

public class SuperAdmin extends User{
    public String level = "super-admin";

    public SuperAdmin(String name, LocalDate dob){
        super(name, dob);
    }
}
