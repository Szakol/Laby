package com.company;

import java.io.File;

public class Animal {
    final String species;
    public String name;
    public File pic;
    private Double weight;

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
