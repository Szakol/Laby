package com.company;

public class Animal {
    String species;
    Double weight;
    String name;

    public Animal(String species, double weight, String name) {
        this.species = species;
        this.weight = weight;
        this.name = name;
    }

    void write() {
        System.out.println("Gatunek: " + species + " Nazwa: " + name + " Waga " + weight);
    }

    void feed() {
        weight += 1;
    }
}
