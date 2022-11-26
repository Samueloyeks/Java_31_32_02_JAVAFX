package com.example.javaformpractice.exceptions;

public class SdaException extends RuntimeException {
    public SdaException(final String message, final Throwable cause) {
        super(message, cause);
    }
}
