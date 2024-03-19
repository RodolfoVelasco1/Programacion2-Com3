package Ejercicio2;

public class Vaca extends Animal {
    private String cuernos;
    private String pelaje;

    public Vaca() {}
    public Vaca(String nombre, int edad, String genero, String cuernos, String pelaje) {
        super.setNombre(nombre);
        super.setEdad(edad);
        super.setGenero(genero);
        this.cuernos = cuernos;
        this.pelaje = pelaje;
    }

    public String getCuernos() {
        return cuernos;
    }

    public void setCuernos(String cuernos) {
        this.cuernos = cuernos;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public void hacer_sonido(){
        System.out.println("La vaca muje.");
    }

    public void informacion(){
        System.out.println("---- Información De La Vaca ----");
        System.out.println("Animal : Vaca");
        System.out.println("Nombre: " + super.getNombre());
        System.out.println("Edad: " + super.getEdad());
        System.out.println("Genero: " + super.getGenero());
        System.out.println("Cuernos: " + getCuernos());
        System.out.println("Pelaje: " + getPelaje());
    }
}
