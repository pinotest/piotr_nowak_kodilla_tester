package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public static void main(String[] args) {

        Person person = new Person("Peter", 19, new Plumber(2000, "Repair"));
        System.out.println(person.getResponsibilities());

        Person secondPerson = new Person("Anna", 29, new Engineer(4000, "Construct building"));
        System.out.println(secondPerson.getResponsibilities());

        Person thirdPerson = new Person("John", 44, new Developer(20000, "Software programing"));
        System.out.println(thirdPerson.getResponsibilities());

        Person lastPerson = new Person("Maria", 60, new Doctor(50000, "Surgery"));
        System.out.println(lastPerson.getResponsibilities());


    }
    public Person(String firstName, int age, Job job){
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }
    public String getResponsibilities(){

        return job.getResponsibilities();
    }
}
