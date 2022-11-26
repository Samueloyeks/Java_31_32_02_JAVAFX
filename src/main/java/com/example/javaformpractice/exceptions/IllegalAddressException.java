package com.example.javaformpractice.exceptions;

public class IllegalAddressException extends IllegalArgumentException {
    public IllegalAddressException(final String address){
        super(String.format("Provided address %s is not valid", address));
    }
}
