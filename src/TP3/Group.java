package TP3;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student>{
    private String form;
    private char letter;
    private ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Subject>subjects = new ArrayList<>();


    public Group(String form, char letter) {
        this.form = form;
        this.letter = letter;
        this.students = new ArrayList<>();
        this.subjects = new ArrayList<>();
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<Subject> subjects) {
        this.subjects = subjects;
    }

    public void addStudent(Student student){
        students.add(student);
        student.addGroups(this);
    }

    public void addSubject(Subject subject){
        subjects.add(subject);
        subject.addGroup(this);
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

}
