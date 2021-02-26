package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog", 20.5, "Krzyś");
        dog.write();
        dog.feed();
        dog.feed();
        dog.feed();
        dog.write();
        Animal horse = new Animal("mustang", 200, "rafał");
        horse.write();
    }
}
