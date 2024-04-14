package Abril09Relaciones;

public class Student {
    private String name;
    private College college;

    public Student(String name, College college) {
        this.name = name;
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public void changeUniversity(College newCollege){
        this.college = newCollege;
    }
}
