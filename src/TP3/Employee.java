package TP3;

public class Employee {
    private String name;
    private Employee supervisor;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Employee supervisor) {
        this.supervisor = supervisor;
    }

    public void assignSupervisor(Employee supervisor){
        this.supervisor = supervisor;
    }

    public void obtainSupervisorsName(){
        if(this.supervisor == null){
            System.out.println("El empleado '" + this.getName() + "' no tiene supervisor.");
        } else {
            System.out.println("El empleado '" + this.getName() + "' tiene un supervisor llamado '" + this.getSupervisor().getName() + "'.");
        }
    }
}
