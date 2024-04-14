package Abril09Relaciones;

import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<Person> owners;

    public Book(String title) {
        this.title = title;
        this.owners = new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Person> getOwners() {
        return owners;
    }

    public void setOwners(ArrayList<Person> owners) {
        this.owners = owners;
    }

    public void addOwner(Person owner){
        owners.add(owner);
    }

    public void showOwner(){
        System.out.println("• Al libro '" + this.getTitle() + "' lo tienen: ");
        for(Person owner : owners){
            System.out.println(owner.getName());
        }
    }
}
