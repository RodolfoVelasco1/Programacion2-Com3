package Clase19MarzoEj1;

public class Operario extends Empleado {
    private int numEmpleado;


    public Operario() {}
    public Operario(String nombre, int numEmpleado) {
        super.setNombre(nombre);
        this.numEmpleado = numEmpleado;
    }
    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    @Override
    public String toString() {
        return super.toString() + ", Número de ID del Empleado: " + this.numEmpleado;
    }

    public void trabajar(){
        System.out.println("Estoy trabajando.");
    }

}
