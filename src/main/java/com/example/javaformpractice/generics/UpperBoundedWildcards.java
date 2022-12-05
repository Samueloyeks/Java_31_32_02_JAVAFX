package com.example.javaformpractice.generics;

import java.util.List;

public class UpperBoundedWildcards {

    public static double sum(final List<? extends Number> numbers){
        double sum = 0;

        for(Number number: numbers){
            sum += number.doubleValue();
        }

        return sum;
    }

    public static void addNumbers(List<? super Integer> list){
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Integer> values = List.of(1, 2, 3, 4);
        System.out.println(sum(values));

        Number mynumber = 5;

        addNumbers(List.of(1,2,3));
        addNumbers(List.of("sam" ));
        addNumbers(List.of(new Object(), new Object(), new Object()));
        addNumbers(List.of(mynumber));

    }
}


// OPERATION 1 ========thread==========> OPERATION 1 COMPLETED
