package TP2;

public class Fish extends Animal {
    private String species;

    public Fish(String name, int edad, String animalKind, double price, String species) {
        super(name, edad, animalKind, price);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString(){
        return (super.getName()) + " es un pez pequeño y amistoso. Es muy curioso, por lo que le gusta recorrer los juguetes y castillos que se coloquen en su pecera.";
    }
}
