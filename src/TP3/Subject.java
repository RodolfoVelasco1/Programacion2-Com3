package TP3;

public class Subject {
    private int classroom;
    private String time;
    private String name;
    private Teacher teacher;
    private Group group;

    public Subject(int classroom, String time, String name) {
        this.classroom = classroom;
        this.time = time;
        this.name = name;
        this.teacher = teacher;
        this.group = group;
    }

    public int getClassroom() {
        return classroom;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void addTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public void addGroup(Group group){
        this.group = group;
    }
}
