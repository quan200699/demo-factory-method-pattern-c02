package com.codegym;

public class AnimalFactory {
    public static Animal getAnimalType(String animalType) {
        Animal animal;
        switch (animalType) {
            case "CAT": {
                animal = new Cat();
                break;
            }
            case "DOG": {
                animal = new Dog();
                break;
            }
            case "LION": {
                animal = new Lion();
                break;
            }
            default:
                throw new IllegalStateException("Unexpected value: " + animalType);
        }
        return animal;
    }
}
