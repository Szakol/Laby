package com.company;

public class Human {
    public String firstName;
    public String lastName;
    public Animal pet;
    protected String phone;

    public Human(String firstName, String lastName, String phone, Animal pet) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pet = pet;
    }

    void write() {
        System.out.println("Hi " + firstName + " yout pet is " + pet.name);
    }
}
