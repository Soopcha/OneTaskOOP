package ru.vsu;

import java.util.ArrayList;
import java.util.List;

public class PetViewModel {
    private List<Pet> pets = new ArrayList<>();

    public PetViewModel(List<Pet> pets) {
        this.pets = pets;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void addPets(List<Pet> pets) {
        this.pets.addAll(pets); // Добавление всех элементов из переданного списка
    }
}
