package TP2;

public class ChildrenBook extends Book {
    private boolean pictureBook;

    public ChildrenBook(String title, String author, int yearPublishment, boolean borrowed, boolean pictureBook) {
        super(title, author, yearPublishment, borrowed);
        this.pictureBook = pictureBook;
    }

    public boolean isPictureBook() {
        return pictureBook;
    }

    public void setPictureBook(boolean pictureBook) {
        this.pictureBook = pictureBook;
    }

    @Override
    public void bookInfo(){
        String pictures;
        if (this.isPictureBook() == true){
            pictures = "Sí";
        } else {
            pictures = "No";
        }
        super.bookInfo();
        System.out.println("El libro sólo tiene imágenes: " + pictures);
    }
}
