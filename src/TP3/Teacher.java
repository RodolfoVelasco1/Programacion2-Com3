package TP3;

import java.util.ArrayList;
import java.util.Iterator;

public class Teacher extends Person implements Iterable<Subject>{
    private String department;
    private ArrayList<Subject>subjects = new ArrayList<>();

    public Teacher(int id, String name, String department) {
        super(id, name);
        this.department = department;
        this.subjects = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
        subject.addTeacher(this);
    }

    @Override
    public Iterator<Subject> iterator() {
        return subjects.iterator();
    }
}
