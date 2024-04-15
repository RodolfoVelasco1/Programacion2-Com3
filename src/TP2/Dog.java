package TP2;

public class Dog extends Animal {
    private String breed;
    private boolean vaccinated;

    public Dog(String name, int edad, String animalKind, double price, String breed, boolean vaccinated) {
        super(name, edad, animalKind, price);
        this.breed = breed;
        this.vaccinated = vaccinated;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

    @Override
    public String toString(){
        return (super.getName()) + " es un perro juguetón y amigable. Es muy cariñoso y es perfecto para familias con niños.";
    }

}
