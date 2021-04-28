package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int windows;
    private int linux;

    public OperatingSystem( int windows, int linux){
        this.windows = windows;
        this.linux = linux;
    }



    public void turnOfSystem() {
        System.out.println(" System Of");
    }

    public void turnOnSystem() {
        System.out.println(" System On");
    }

    public int getWindows(){
        return windows;
    }

    public int getLinux() {
        return linux;
    }
}