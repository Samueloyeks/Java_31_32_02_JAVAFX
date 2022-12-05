package com.example.javaformpractice.InputOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ByteStream {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("");
            FileOutputStream out = new FileOutputStream("");


        } catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
