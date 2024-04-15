package TP2;

public class Cat extends Animal {
    private String breed;
    private boolean sterilized;

    public Cat(String name, int edad, String animalKind, double price, String breed, boolean sterilized) {
        super(name, edad, animalKind, price);
        this.breed = breed;
        this.sterilized = sterilized;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isSterilized() {
        return sterilized;
    }

    public void setSterilized(boolean sterilized) {
        this.sterilized = sterilized;
    }

    @Override
    public String toString(){
        return (super.getName()) + " es un gato juguetón pero independiente. Le gusta jugar con su dueño y salir solo de noche a recorrer las calles.";
    }
}
