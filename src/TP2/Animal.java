package TP2;

public abstract class Animal {
    private String name;
    private int edad;
    private String animalKind;
    private double price;

    public Animal(String name, int edad, String animalKind, double price) {
        this.name = name;
        this.edad = edad;
        this.animalKind = animalKind;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void feed(){
        System.out.println("Acabas de alimentar al " + this.getName());
    }
}
