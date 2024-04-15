package TP2;

import java.util.ArrayList;

public class PetShop {
    private String name;
    private ArrayList<Animal>animals;

    public PetShop(String name) {
        this.name = name;
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void sellAnimal(String name){
        int found = 0;
        for (Animal animal : animals) {
            if (animal.getName().contains(name)) {
                animals.remove(animal);
                found = found + 1;
                break;
            }
        }
        if (found > 0){
            System.out.println("Se ha vendido a: " + name);
        } else {
            System.out.println(name + " no se encuentra en la lista de animales. No puedes venderlo.");
        }
    }

    public void feedAnimal(String name){
        int found = 0;
        for (Animal animal : animals) {
            if (animal.getName().contains(name)) {
                found = found + 1;
            }
        }
        if (found > 0) {
            System.out.println("Alimentaste a " + name);
        } else {
            System.out.println("No puedes alimentar a " + name + " porque no se encuentra en la lista de animales.");
        }
    }

    public void animalList(){
        System.out.println("Los animales de la tienda son: ");
        for(Animal animal : animals){
            System.out.println("Animal: " + animal.getAnimalKind() + ". Nombre: " + animal.getName() + ".");
        }
    }


}
