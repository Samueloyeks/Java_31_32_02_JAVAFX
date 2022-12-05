package com.example.javaformpractice.generics;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class UserProfile<T extends User>{
    private String name;
    private LocalDate dob;
    public UserProfile(String name, LocalDate dob){
        this.name = name;
        this.dob = dob;
    }

    public Integer getAge(){
        LocalDate currentDate = LocalDate.now();

        return Period.between(dob, currentDate).getYears();
    }


    public static void main(String[] args) {
        UserProfile<Admin> userProfile= new UserProfile<>("sam", LocalDate.of(1985, Month.JULY, 10));
        System.out.println(userProfile.getAge());
    }
}
