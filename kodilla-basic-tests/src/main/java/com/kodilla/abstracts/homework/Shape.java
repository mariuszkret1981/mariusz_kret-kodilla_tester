package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int field;
    private int circuit;

    public Shape( int field, int circuit ){
        this.field= field;
        this.circuit = circuit;
    }
     public  int getField(){
        return field;
     }

    public int getCircuit() {
        return circuit;
    }
    public abstract void getPatternForTheField();{

    }
    public abstract void getPatternForTheCircuit();

}
