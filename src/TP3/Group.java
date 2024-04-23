package TP3;

import java.util.ArrayList;
import java.util.Iterator;

public class Group implements Iterable<Student>{
    private String form;
    private char letter;
    private ArrayList<Student>students = new ArrayList<>();
    private ArrayList<Subject>subjects = new ArrayList<>();
    static ArrayList<Student>allStudents = new ArrayList<>();


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

    public static ArrayList<Student> getAllStudents() {
        return allStudents;
    }

    public static void setAllStudents(ArrayList<Student> allStudents) {
        Group.allStudents = allStudents;
    }

    public void addStudent(int id, String name){
        boolean found = false;
        found = findStudent(id);
        if (found == true){
            int position = findIndex(id);
            students.add(allStudents.get(position));
            students.get(students.size() - 1).addGroups(this);

        } else {
            students.add(new Student(id, name));
            students.get(students.size() - 1).addGroups(this);
            allStudents.add(students.get(students.size() - 1));
        }

    }

    public void addSubject(Subject subject){
        subjects.add(subject);
        subject.addGroup(this);
    }

    @Override
    public Iterator<Student> iterator() {
        return students.iterator();
    }

    public boolean findStudent(int id){
        for(Student student : Group.allStudents){
            if(id == student.getId()){
                return true;
            }
        }
        return false;
    }

    public int findIndex(int id){
        for(Student student : Group.allStudents){
            if(id == student.getId()){
                return allStudents.indexOf(student);
            }
        }
        return id;
    }



}
