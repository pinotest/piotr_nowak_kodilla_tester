package com.kodilla.abstracts.homework;

public abstract class Job {
    private double salary;
    private String responsibilities;

    public Job(double salary, String responsibilities){
        this.responsibilities = responsibilities;
        this.salary = salary;
    }
    public String getResponsibilities(){
        return responsibilities;
    }

}
