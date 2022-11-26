package com.example.javaformpractice.exceptions;

import com.example.javaformpractice.BlackKnight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionsPractice {
    RuntimeException runtimeException; // unchecked exceptions
    Exception exception; // checked exceptions

    public static void main(String[] args) {
        Throwable throwable = new Throwable();
        SdaException sdaException = new SdaException("Something wrong with zoom link", throwable);

        IllegalAddressException illegalAddressException = new IllegalAddressException("999 @#$%");

        throw illegalAddressException;
    }

    public static void thisThrowsException() throws FileNotFoundException {
        // we try to access value of variable which is null
        BufferedReader bufferedReader = null;

        bufferedReader = new BufferedReader(new FileReader("../../file.txt"));

    }

}
