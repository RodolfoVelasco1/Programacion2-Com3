package Clase19MarzoEj1;

public class Directivo extends Empleado {
    private String apellido;

    public Directivo() {}
    public Directivo(String nombre, String apellido) {
        super.setNombre(nombre);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        apellido = apellido;
    }

    @Override
    public String toString() {
        return super.toString() + ", Apellido: " + this.apellido;
    }

    public void dirigir(){
        System.out.println("Estoy dirigiendo.");
    }
}
