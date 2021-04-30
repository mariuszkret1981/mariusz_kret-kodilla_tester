package com.kodilla.abstracts.homework;

public abstract class Job {
    private  int salary;
    private String responsibilities;
    private int amountOfLeave;

    public Job(int salary, String responsibilities, int amountOfLeave){
        this.salary = salary;
        this.responsibilities = responsibilities;
        this.amountOfLeave = amountOfLeave;
    }
    public int getSalary(){
        return salary;
    }
    public String getResponsibilities(){
        return responsibilities;
    }
    public  int getAmountOfLeave(){
        return amountOfLeave;
    }

  public abstract void typeOfWork();
}
