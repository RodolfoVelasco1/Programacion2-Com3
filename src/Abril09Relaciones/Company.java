package Abril09Relaciones;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department){
        departments.add(department);
    }

    public void showDepartment(){
        System.out.println("-La compañía '" + this.getName() + "' tiene los siguientes departamentos: ");
        for(Department department : departments){
            System.out.println(department.getName());
        }
    }


}
