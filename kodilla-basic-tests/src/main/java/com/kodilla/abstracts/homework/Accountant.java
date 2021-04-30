package com.kodilla.abstracts.homework;

public class Accountant extends Job{

    public Accountant() {
        super(6000,"accounting", 26 );
    }

    @Override
    public void typeOfWork() {
        System.out.println("Pracownik umysłwoy");
        System.out.println(getSalary());
        System.out.println(getResponsibilities());

    }
}
