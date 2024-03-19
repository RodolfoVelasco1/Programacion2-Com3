package Ejercicio2;

public class Perro extends Animal {
    private String pelaje;
    private String raza;

    public Perro() {}
    public Perro(String nombre, int edad, String genero, String pelaje, String raza) {
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setGenero(genero);
        this. pelaje = pelaje;
        this.raza = raza;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacer_sonido(){
        System.out.println("El perro ladra.");
    }

    public void informacion(){
        System.out.println("---- Información Del Perro ----");
        System.out.println("Animal : Perro");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Pelaje: " + getPelaje());
        System.out.println("Raza: " + getRaza());
    }

}
