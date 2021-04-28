package com.kodilla.inheritance.homework;

public class Test {

    public static void main(String[] args) {
        OperatingSystem operatingSystem =new OperatingSystem(2020,2017);
        operatingSystem.turnOfSystem();
        Computer computer =new Computer(2021,2015);
        System.out.println(computer.getWindows());
        Power power = new Power(2020, 2017);
        System.out.println(power.getLinux());
    }


}
