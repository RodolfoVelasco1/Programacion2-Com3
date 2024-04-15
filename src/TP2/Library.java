package TP2;

import java.util.ArrayList;

public class Library {
    private String name;
    private ArrayList<Book>books;

    public Library(String name) {
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
    }

    public void borrowBook(String name){
        int found = 0;
        for (Book book : books) {
            if (book.getTitle().contains(name)) {
                book.borrowBook(book);
                found = found + 1;
                break;
            }
        }
        if(found == 0) {
            System.out.println("La biblioteca no tiene el libro '" + name + "'.");
        }
    }

    public void returnBook(String name){
        int found = 0;
        for (Book book : books) {
            if (book.getTitle().contains(name)) {
                book.returnBook(book);
                found = found + 1;
                break;
            }
        }
        if(found == 0) {
            System.out.println("No puedes devolver el libro '" + name + "' porque no pertenece a esta biblioteca.");
        }
    }

    public void bookList(){
        System.out.println("-Libros disponibles:");
        for(Book book : books){
            if(book.isBorrowed() == false){
                System.out.println(book.getTitle());
            }
        }
    }



}
