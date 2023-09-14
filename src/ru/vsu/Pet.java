package ru.vsu;

public class Pet  extends Animal implements Identifiable {
    // implements Identifiable те класс обязан реализовать метод из интерфейса этого, те getId()
    private Integer id;
    private Integer age;
    private String name;
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

    public Pet(Integer id, Integer age, String name, String type, String breed, boolean carnivore, Owner owner, PetInformation patInfo) {
        super(type, breed, carnivore);
        this.id = id;
        this.age = age;
        this.name = name;
        this.owner = owner;
        this.patInfo = patInfo;
    }

    public String feed(String feed) {
        if (isHerbivore()){
            return "Трава";
        } else
            return "Мясо";
    }

    private Boolean isHerbivore() { //травоядный ли
        return !(this.isCarnivore());
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Name: ").append(name).append("\n");
        sb.append("Age: ").append(age).append("\n");
        sb.append("Type: ").append(getType()).append("\n");
        sb.append("Breed: ").append(getBreed()).append("\n");
        sb.append("Carnivore: ").append(isCarnivore() ? "Yes" : "No").append("\n");
        sb.append("Owner: ").append(owner.getName()).append("\n");
        sb.append("Pet Information: ").append(patInfo.print()).append("\n");
        return sb.toString();
    }
}
