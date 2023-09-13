package ru.vsu;

public class Vaccine {// вакцина
    private String type;
    private String name;

    public Vaccine(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
