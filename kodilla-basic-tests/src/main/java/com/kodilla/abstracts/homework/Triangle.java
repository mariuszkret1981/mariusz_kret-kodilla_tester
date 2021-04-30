package com.kodilla.abstracts.homework;

public class Triangle extends Shape{


    public Triangle() {
        super(4, 12);
    }

    @Override
    public void getPatternForTheField() {
        System.out.println("P = 1/2a*h = " + getField());

    }

    @Override
    public void getPatternForTheCircuit() {
        System.out.println("Ob = a + b + c = " + getCircuit());


    }
}
