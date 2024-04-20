package TP3;

import java.util.ArrayList;
import java.util.Iterator;

public class Student extends Person implements Iterable<Group>{
    private ArrayList<Group>groups = new ArrayList<>();
    public Student(int id, String name) {
        super(id, name);
        this.groups = new ArrayList<>();
    }

    public ArrayList<Group> getGroups() {
        return groups;
    }

    public void setGroups(ArrayList<Group> groups) {
        this.groups = groups;
    }
    public void addGroups(Group group){
        groups.add(group);
    }

    @Override
    public Iterator<Group> iterator() {
        return groups.iterator();
    }
}
