package TP1;

public class Novels extends Book {
    private String genre;

    public Novels(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Género: " + this.getGenre());
    }
}
