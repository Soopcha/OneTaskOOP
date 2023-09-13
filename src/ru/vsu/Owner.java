package ru.vsu;

public class Owner implements Experienced {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner(String name) {
        this.name = name;
    }
}
