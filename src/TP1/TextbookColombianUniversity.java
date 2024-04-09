package TP1;

public class TextbookColombianUniversity extends Textbook {
    private String faculty;

    public TextbookColombianUniversity(String title, String author, double price, String course, String faculty) {
        super(title, author, price, course);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void print(){
        super.print();
        System.out.println("Facultad que lo publicó: " + this.getFaculty());
    }
}
