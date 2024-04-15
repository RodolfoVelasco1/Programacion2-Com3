package TP2;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, int yearPublishment, boolean borrowed, String genre) {
        super(title, author, yearPublishment, borrowed);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void bookInfo(){
        super.bookInfo();
        System.out.println("Género: " + this.getGenre());
    }
}
