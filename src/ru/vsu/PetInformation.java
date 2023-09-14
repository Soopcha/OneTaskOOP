package ru.vsu;

public class PetInformation {
    private String traits;// черты
    private Vaccine vaccine;

    public String getTraits() {
        return traits;
    }

    public void setTraits(String traits) {
        this.traits = traits;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    public PetInformation(String traits, Vaccine vaccine) {
        this.traits = traits;
        this.vaccine = vaccine;
    }
    public PetInformation() {
    }

    public String print() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pet Traits: ").append(traits).append("\n");
        if (vaccine != null) {
            sb.append("Vaccine Information: ").append(vaccine.getName().toString()).append("    ").append(vaccine.getType().toString());
        } else {
            sb.append("No vaccine information available.");
        }
        return sb.toString();
    }
}
