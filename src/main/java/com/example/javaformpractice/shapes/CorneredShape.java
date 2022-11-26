package com.example.javaformpractice.shapes;

public class CorneredShape implements IShape {
    private int numOfEdges;

    public CorneredShape(int numOfEdges){
        this.numOfEdges = numOfEdges;
    }

    public double getArea(){
        return numOfEdges;
    }
}
