package Clase19MarzoEj1;

public class Tecnico extends Operario {
    private int diasPresencial;

    public Tecnico() {}
    public Tecnico(String nombre, int numEmpleado, int diasPresencial) {
        super.setNombre(nombre);
        super.setNumEmpleado(numEmpleado);
        this.diasPresencial = diasPresencial;
    }

    public int getDiasPresencial() {
        return diasPresencial;
    }

    public void setDiasPresencial(int diasPresencial) {
        this.diasPresencial = diasPresencial;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cantidad de días que asiste a la empresa: " + this.diasPresencial;
    }

    public void programar(){
        System.out.println("Estoy programando");
    }

}
