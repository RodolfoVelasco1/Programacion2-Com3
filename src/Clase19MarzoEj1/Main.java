package Clase19MarzoEj1;

public class Main {
    public static void main(String[] args) {
        Directivo directivo1 = new Directivo("Juan", "Diaz");
        Operario operario1 = new Operario("Raul", 1);
        Oficial oficial1 = new Oficial("Rocio", 2, "Administración");
        Tecnico tecnico1 = new Tecnico("Pedro", 3, 4);

        System.out.println("---Directivo---");
        System.out.println(directivo1.toString());
        directivo1.dirigir();

        System.out.println("---Operario---");
        System.out.println(operario1.toString());
        operario1.trabajar();

        System.out.println("---Oficial---");
        System.out.println(oficial1.toString());
        oficial1.controlar();

        System.out.println("---Tecnico---");
        System.out.println(tecnico1.toString());
        tecnico1.programar();



    }
}
