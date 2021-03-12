package com.company;

public class Animal {
    final private String species;
    private Double weight;
    //***************************************************
    private final Double DEFOULT_ANIMAL_WEIGHT = 1.0;
    private final Double DEFOULT_DOG_WEIGHT = 7.0;
    private final Double DEFOULT_CAT_WEIGHT = 3.0;
    private final Double DEFOULT_COW_WEIGHT = 500.0;
    //***************************************************

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                weight = DEFOULT_DOG_WEIGHT;
                break;
            case "cat":
                weight = DEFOULT_CAT_WEIGHT;
                break;
            case "cow":
                weight = DEFOULT_COW_WEIGHT;
                break;
            default:
                weight = DEFOULT_ANIMAL_WEIGHT;
                break;
        }
    }

    //***************************************************
    //FUNKCJE
    void takeForAWalk() {
        if (weight > 0) {
            weight -= 1.0;
            System.out.println("I'm losing weight");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }

    void feed() {
        if (weight > 0) {
            weight += 1.0;
            System.out.println("Was good, thx for food!");
        } else if (weight <= 0) {
            System.out.println("Dude im dead");
        }
    }
    //***************************************************
}