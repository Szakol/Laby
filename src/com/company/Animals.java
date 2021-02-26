package com.company;

public class Animals {
    String species;
    Double weight;
    String name;

    public Animals(String nazwa, double waga, String imie) {
        species = nazwa;
        weight = waga;
        name = imie;
    }

    void write() {
        System.out.println("Nazwa: " + name + " Waga " + weight);
    }

    void feed() {
        weight += 1;
    }
}
