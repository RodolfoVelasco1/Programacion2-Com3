package TP2;

public abstract class Book implements Borrowable {
    private String title;
    private String author;
    private int yearPublishment;
    private boolean borrowed;

    public Book(String title, String author, int yearPublishment, boolean borrowed) {
        this.title = title;
        this.author = author;
        this.yearPublishment = yearPublishment;
        this.borrowed = borrowed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearPublishment() {
        return yearPublishment;
    }

    public void setYearPublishment(int yearPublishment) {
        this.yearPublishment = yearPublishment;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public void borrowBook(Book book) {
        if(book.isBorrowed() == false){
            System.out.println("Pediste prestado el libro '" + book.getTitle() + "' de la biblioteca");
            book.setBorrowed(true);
        } else {
            System.out.println("No puedes pedir prestado el libro '" + book.getTitle() + "' porque ya fue prestado.");
        }

    }

    @Override
    public void returnBook(Book book) {
        if(book.isBorrowed() == true){
            System.out.println("Devolviste el libro '" + book.getTitle() + "' a la biblioteca");
            book.setBorrowed(false);
        } else {
            System.out.println("No puedes devolver el libro '" + book.getTitle() + "' porque no lo tienes.");
        }
    }

    public void bookInfo(){
        System.out.println("--Libro--");
        System.out.println("Nombre: " + this.getTitle());
        System.out.println("Autor: " + this.getAuthor());
        System.out.println("Año de publicación: " + this.getYearPublishment());
        System.out.println("Prestado: No");
    }
}
