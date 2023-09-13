package ru.vsu;

public class Animal {
    private String type;
    private String breed; //порода
    private Boolean carnivore; //плотоядное ли животное

    public Animal(String type, String breed, boolean carnivore) {
        this.type = type;
        this.breed = breed;
        this.carnivore = carnivore;
    }

    public String getType() {
        return type;
    }

    public String getBreed() {
        return breed;
    }

    public boolean isCarnivore() {
        return carnivore;
    }
}
