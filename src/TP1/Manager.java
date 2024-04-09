package TP1;

public class Manager extends Employee {
    private String department;

    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void organizingActivities(){
        System.out.println(super.getName() + " está organizando actividades para el departamento de " + this.department);
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Departamento: " +this.getDepartment());
    }
}
