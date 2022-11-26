package com.example.javaformpractice.shapes;

public class Triangle extends CorneredShape {
    private double base;
    private double side1;
    private double side2;

    public Triangle(double base, double side1, double side2){
        super(3);
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public double getArea() {
        // bh/2
        return (base * side1) / 2;
    }


    public static void main(String[] args) {
        Triangle myTriangle = new Triangle(15, 20, 25);
        Circle myCircle = new Circle(10);

        if(myTriangle instanceof IRound) {
            IRound myRoundShape =  (IRound) myTriangle;
            System.out.println("casted successfully");
        } else {
            System.out.println("cannot cast");
        }


    }
}
