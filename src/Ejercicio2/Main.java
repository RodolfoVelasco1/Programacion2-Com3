package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("Choco", 5, "Macho", "Marrón", "Labrador");
        Vaca vaca1 = new Vaca("Cora", 7, "Hembra", "Tiene", "Blanco");
        Pajaro pajaro1 = new Pajaro("Piolín", 1, "Hembra", "Corto", "Períco");

        perro1.hacer_sonido();
        vaca1.hacer_sonido();
        pajaro1.hacer_sonido();
        perro1.informacion();
        vaca1.informacion();
        pajaro1.informacion();
    }

}
