package TP2;

public class Bird extends Animal {
    private String species;
    private boolean talks;

    public Bird(String name, int edad, String animalKind, double price, String species, boolean talks) {
        super(name, edad, animalKind, price);
        this.species = species;
        this.talks = talks;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isTalks() {
        return talks;
    }

    public void setTalks(boolean talks) {
        this.talks = talks;
    }

    @Override
    public String toString(){
        return (super.getName()) + " es un ave pequeña y con unas plumas coloridas y elegantes. Tiene unas alas muy bellas y vuela a gran velocidad.";
    }
}
