package ru.vsu;

import java.util.ArrayList;
import java.util.List;

public class PetViewModel {
    private List<Pet> pets = new ArrayList<>();

    public PetViewModel(List<Pet> pets) {
        this.pets = pets;
    }
    public PetViewModel() {
    }


    public List<Pet> getPets() {
        return pets;
    }

    public void addPets(List<Pet> pets) {
        this.pets.addAll(pets); // Добавление всех элементов из переданного списка
    }
    public void addOnePets(Pet pet) {
        this.pets.add(pet); // Добавление 1 эл из переданного списка
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pets:\n");
        for (Pet pet : pets) {
            sb.append(pet.print()).append("\n"); // Используем метод print из класса Pet
        }
        return sb.toString();
    }
}
