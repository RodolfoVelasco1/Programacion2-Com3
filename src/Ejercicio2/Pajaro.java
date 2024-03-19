package Ejercicio2;

public class Pajaro extends Animal {
    private String plumaje;
    private String especie;

    public Pajaro() {}
    public Pajaro(String nombre, int edad, String genero, String plumaje, String especie) {
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setGenero(genero);
        this.plumaje = plumaje;
        this.especie = especie;
    }

    public String getPlumaje() {
        return plumaje;
    }

    public void setPlumaje(String plumaje) {
        this.plumaje = plumaje;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    public void hacer_sonido(){
        System.out.println("El pájaro pía.");
    }

    public void informacion(){
        System.out.println("---- Información Del Pájaro ----");
        System.out.println("Animal : Pájaro");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Plumaje: " + getPlumaje());
        System.out.println("Especie: " + getEspecie());
    }
}
