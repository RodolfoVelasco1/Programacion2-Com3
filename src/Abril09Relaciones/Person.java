package Abril09Relaciones;

import java.util.ArrayList;

public class Person {
    private String name;
    private ArrayList<Book> books;

    public Person(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(Book book){
        books.add(book);
        book.addOwner(this);
    }

    public void showBook(){
        System.out.println("• Los libros de " + this.getName() + " son: ");
        for (Book book : books){
            System.out.println(book.getTitle());
        }
    }

}
