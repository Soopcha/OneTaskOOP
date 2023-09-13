package ru.vsu;

public class Pet implements Identifiable {
    private Integer id;
    private Integer age;
    private String name;
    private Animal type;
    private Owner owner;
    private PetInformation patInfo;

    public Integer getId() {
        return id;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getType() {
        return type;
    }


    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public PetInformation getPatInfo() {
        return patInfo;
    }

    public void setPatInfo(PetInformation patInfo) {
        this.patInfo = patInfo;
    }

    public Pet(Integer id, Integer age, String name, Animal type, Owner owner, PetInformation patInfo) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.type = type;
        this.owner = owner;
        this.patInfo = patInfo;
    }

    public String feed(String feed) {
        if (isHerbivore(type)){
            return "Трава";
        } else
            return "Мясо";
    }

    private Boolean isHerbivore(Animal type) { //травоядный ли
        return !(type.isCarnivore());
    }
}
