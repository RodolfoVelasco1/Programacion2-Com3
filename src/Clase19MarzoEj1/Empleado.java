package Clase19MarzoEj1;

public abstract class Empleado {
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString(){
        return "Nombre: " + this.nombre;
    }
}
