package com.kodilla.inheritance.homework;

public class Power extends Computer{

    public Power( int windows, int linux){
        super(windows, linux);
    }


   public void turnOfPower(){
       System.out.println("Turn of the power");
   }

   public void turnOnPower(){
       System.out.println("turn on the power");
   }
}
