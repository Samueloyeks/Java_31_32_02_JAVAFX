package com.example.javaformpractice.shapes;

public class Circle implements IShape, IRound{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}
