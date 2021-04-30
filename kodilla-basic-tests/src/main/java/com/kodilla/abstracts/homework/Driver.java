package com.kodilla.abstracts.homework;

class Driver extends Job{
    public Driver() {
        super(4000, "driving a car",26);
    }

    @Override
    public void typeOfWork() {
        System.out.println("Pracownik fizyczny");
        System.out.println(getSalary());
        System.out.println(getAmountOfLeave());
        System.out.println(getResponsibilities());

    }
}
