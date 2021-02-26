package com.company;

public class Main {

    public static void main(String[] args) {
        Animals dog = new Animals("dog", 20.5, "Krzyś");
        dog.write();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.write();
        Animals horse = new Animals("mustang", 200, "rafał");
        horse.write();
    }
}
