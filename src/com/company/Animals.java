package com.company;

public class Animals {
    String species;
    Double weight;
    String name;

    public Animals(String dog, double v, String krzyś) {
    }

    void Animals(String gatunek, double waga, String nazwa) {
        species = gatunek;
        weight = waga;
        name = nazwa;
    }

    void write() {
        System.out.println("Nazwa: " + name + " Waga " + weight);
    }

    void feed() {
        weight += 1;
    }
}
