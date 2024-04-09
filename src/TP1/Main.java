package TP1;

public class Main {
    public static void main(String[] args){
        System.out.println("-----------EJERCICIO 8-----------");
        Manager m1 = new Manager("Graciela", 38, 900000, "Recursos Humanos");
        Worker w1 = new Worker("Roberto", 25, 250000, "Administración");
        m1.printInfo();
        m1.organizingActivities();
        w1.printInfo();
        w1.producing();

        System.out.println(" ");
        System.out.println("-----------EJERCICIO 9-----------");
        System.out.println(" ");
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(8, 4);
        System.out.println("El círculo tiene un radio de " + c1.getRadio() + " cm.");
        c1.area();
        c1.perimeter();
        System.out.println("El rectángulo mide " + r1.getLength() + " cm de alto y " + r1.getWidth() + " cm de ancho.");
        r1.area();
        r1.perimeter();

        System.out.println(" ");
        System.out.println("-----------EJERCICIO 10-----------");
        System.out.println(" ");
        Textbook t1 = new Textbook("Huesos de dinosaurios", "Indiano Juanes", 10, "Antropología 1");
        TextbookColombianUniversity tcu1 = new TextbookColombianUniversity("Cuadros Contemporáneos", "Angelo Miguelo", 15, "Oleos 2", "Arte");
        Novels n1 = new Novels("Joleo y Rumieta", "Guillermo Sanchez-Peña", 25, "Romántico");
        t1.print();
        tcu1.print();
        n1.print();




    }
}
