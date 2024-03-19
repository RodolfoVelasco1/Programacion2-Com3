package Clase19MarzoEj1;

public class Oficial extends Operario {
    private String area;

    public Oficial() {}
    public Oficial(String nombre, int numEmpleado, String area) {
        super.setNombre(nombre);
        super.setNumEmpleado(numEmpleado);
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + ", Area: " + this.area;
    }

    public void controlar(){
        System.out.println("Estoy controlando que todos los empleados hayan venido.");
    }
}
