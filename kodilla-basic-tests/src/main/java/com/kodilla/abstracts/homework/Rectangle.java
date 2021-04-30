package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{


    public Rectangle() {
        super(6,10);
    }

    @Override
    public void getPatternForTheField() {
        System.out.println("P = a * b = " + getField());

    }

    @Override
    public void getPatternForTheCircuit() {
        System.out.println("Ob = 2a + 2b = " + getCircuit());

    }
}
