package Abril09Relaciones;

import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    public void showEmployee(){
        System.out.println("-El departamento de " + this.getName() + " tiene los siguientes empleados: ");
        for(Employee employee : employees){
            System.out.println("Nombre: " + employee.getName() + ". Puesto: " + employee.getPosition() + ".");
        }
    }
}
