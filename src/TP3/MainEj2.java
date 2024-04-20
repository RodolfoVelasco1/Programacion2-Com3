package TP3;

public class MainEj2 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Alberto");
        Employee e2 = new Employee("Eduardo");

        e1.assignSupervisor(e2);
        e1.obtainSupervisorsName();
    }
}
