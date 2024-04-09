package TP1;

public abstract class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void work(){
        System.out.println(this.getName() + " está trabajando.");
    }

    public void printInfo(){
        System.out.println(" ");
        System.out.println("Nombre: " + this.getName());
        System.out.println("Edad: " + this.getAge());
        System.out.println("Salario: " + this.getSalary());
    }
}
