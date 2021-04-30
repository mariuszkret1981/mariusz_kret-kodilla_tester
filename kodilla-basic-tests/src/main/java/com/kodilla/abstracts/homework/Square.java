package com.kodilla.abstracts.homework;

public class Square extends Shape{


    public Square() {
        super(4,8);
    }

    @Override
    public void getPatternForTheField() {
        System.out.println("P = a^2 = " + getField());

    }

    @Override
    public void getPatternForTheCircuit() {
        System.out.println("Ob = 4a = " + getCircuit());

    }
}
