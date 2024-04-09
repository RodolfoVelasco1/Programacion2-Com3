package TP1;

public class Worker extends Employee {
    private String area;

    public Worker(String name, int age, double salary, String area) {
        super(name, age, salary);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void producing(){
        System.out.println(super.getName() + " está produciendo en el área de " + this.getArea());
    }

    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Area: " +this.getArea());
    }
}
