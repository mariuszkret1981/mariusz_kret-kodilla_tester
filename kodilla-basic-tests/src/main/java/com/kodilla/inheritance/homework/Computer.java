package com.kodilla.inheritance.homework;

public class Computer extends OperatingSystem{

    public Computer(int windows, int linux){
        super(windows, linux);
    }


    public void turnOfComputer(){
        System.out.println("Computer Of");
    }

    public void turnOnComputer(){
        System.out.println("Computer On");
    }

    @Override
    public void turnOfSystem() {
        super.turnOfSystem();
    }
}
