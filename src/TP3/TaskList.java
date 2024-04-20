package TP3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class TaskList implements Iterable<Task>{
    private ArrayList<Task>tasks = new ArrayList<>();

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(String description, int priority){
        Task task = new Task(description, priority);
        tasks.add(task);
        System.out.println("¡Se agregó la tarea a la lista!");
        tasks.sort(Comparator.comparingInt(Task::getPriority).reversed());
    }

    public  void removeTask(Task task){
        tasks.remove(task);
        System.out.println("¡Se eliminó la tarea de la lista!");
    }

    public void taskNumber(){
        System.out.println("El número total de tareas en la lista es de: " + tasks.size());
    }

    @Override
    public Iterator<Task> iterator() {
        return tasks.iterator();
    }

    public boolean isEmpty() {
        return tasks.isEmpty();
    }
}
