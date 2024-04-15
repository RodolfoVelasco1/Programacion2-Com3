package TP2;

public class Universitary extends Book {
    private String type;

    public Universitary(String title, String author, int yearPublishment, boolean borrowed, String type) {
        super(title, author, yearPublishment, borrowed);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void bookInfo(){
        super.bookInfo();
        System.out.println("Tipo: " + this.getType());
    }
}
