package TP3;

import java.util.Scanner;

public class MainEj1 {
    public static void main(String[] args) {
        Group g1 = new Group("Comisión Uno", 'A');
        g1.addStudent(44654321, "Felipe");
        g1.addStudent(44654322, "Jazmín");
        g1.addStudent(44654323, "Lucas");
        g1.addStudent(44654324, "Mora");
        g1.addStudent(44654325, "Martín");

        Group g2 = new Group("Comisión Dos", 'B');
        g2.addStudent(44654321, "Felipe");
        g2.addStudent(42654322, "Lucía");
        g2.addStudent(42654323, "Rodrigo");
        g2.addStudent(42654324, "Ambar");
        g2.addStudent(42654325, "José");

        Group g3 = new Group("Comisión Tres", 'C');
        g3.addStudent(44654321, "Felipe");
        g3.addStudent(40654322, "Mateo");

        Teacher t1 = new Teacher(35695423, "Roberto", "Programación");
        Subject s1 = new Subject(1, "8:00", "Programación");
        Subject s2 = new Subject(2, "9:00", "Laboratorio");
        Subject s3 = new Subject(3, "10:00", "Arquitectura y Sistemas Operativos");
        t1.addSubject(s1);
        t1.addSubject(s2);
        t1.addSubject(s3);

        Teacher t2 = new Teacher(34123456, "Graciela", "Matemática");
        Subject s4 = new Subject(4, "15:00", "Estadística");
        Subject s5 = new Subject(5, "16:00", "Álgebra");
        Subject s6 = new Subject(6, "17:00", "Matemática");
        t2.addSubject(s4);
        t2.addSubject(s5);
        t2.addSubject(s6);

        Teacher t3 = new Teacher(31852741, "Nestor", "Inglés");
        Subject s7 = new Subject(7, "18:00", "Inglés");
        t3.addSubject(s7);



        g1.addSubject(s1);
        g1.addSubject(s2);
        g1.addSubject(s6);

        g2.addSubject(s4);
        g2.addSubject(s5);
        g2.addSubject(s3);

        g3.addSubject(s7);

        System.out.println("A - Aula de la tercera asignatura de un profesor.");
        System.out.println("La tercera asignatura del Profesor " + t1.getName() + " es " + t1.getSubjects().get(2).getName() + " en el aula " + t1.getSubjects().get(2).getClassroom());

        System.out.println("B - Nombres de todas las asignaturas que imparte un profesor.");
        System.out.print("Materias que imparte el profesor " + t1.getName() + ": ");
        for (Subject subject : t1){
            System.out.print(subject.getName() + ", ");
        }

        System.out.println("\nC - Nombre y DNI de todos los alumnos del grupo que recibe una asignatura.");
        System.out.println("Los alumnos del grupo que recibe la asignatura " + s1.getName() + ": ");
        for(Student student : s1.getGroup()){
            System.out.println("Nombre: " + student.getName() + ". DNI: " + student.getId());
        }

        System.out.println("D - Mostrar la letra del tercer grupo al que pertenece un alumno.");
        System.out.println("La letra del tercer grupo al que pertenece " + g1.getStudents().get(0).getName() + ": " + g1.getStudents().get(0).getGroups().get(2).getLetter());

        System.out.println("E - Todas las asignaturas recibidas por el 1er grupo al que pertenece un alumno.");
        System.out.println("El 1er grupo al que pertenece " + g1.getStudents().get(0).getName() + " es la " + g1.getForm() + " " + g1.getLetter());
        System.out.println("Las asignaturas que recibe este grupo son las siguientes: ");

        for(Subject subjec : g1.getSubjects()){
            System.out.print(subjec.getName() + ", ");
        }

        System.out.println("\nF - Pedir una asignatura y mostrar (desde un alumno) el profesor que imparte dicha asignatura.");
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.print("Ingrese el nombre de la asignatura: ");
            String answer1 = sc.nextLine();
            answer1 = answer1.toLowerCase();
            boolean found = false;
            if(answer1.equals("programación") || answer1.equals("laboratorio") || answer1.equals("arquitectura y sistemas operativos") || answer1.equals("estadística") || answer1.equals("álgebra") || answer1.equals("matemática") || answer1.equals("inglés")){
                for (Group group : g1.getStudents().get(0)){
                    for (Subject subject : group.getSubjects()){
                        if(subject.getName().toLowerCase().contains(answer1)){
                            System.out.println("Asignatura: " + subject.getName() + ". Profesor: " + subject.getTeacher().getName());
                            found = true;
                            break;
                        }
                    }
                    if (found == true){
                        break;
                    }
                }
            } else {
                System.out.println("Error. La asignatura ingresada no se encontró. Intente de nuevo.");
            }
            if (found == true){
                break;
            }
        }

        System.out.println("G - Mostrar todos los alumnos en el grupo de la segunda asignatura de un profesor.");
        System.out.println("La segunda asignatura del profesor " + t1.getName() + " es " + t1.getSubjects().get(1).getName() + " la cual se imparte al grupo " + t1.getSubjects().get(1).getGroup().getForm() + " " + t1.getSubjects().get(1).getGroup().getLetter());
        System.out.print("Los alumnos que pertenecen a este grupo son: ");
        for (Student student : t1.getSubjects().get(1).getGroup()){
            System.out.print(student.getName() + ", ");
        }
        System.out.println("\nH - ¿En qué se diferencian una asociación de una composición y de una agregación?");
        System.out.println("En una asociación, dos instancias A y B relacionadas entre sí existen de forma independiente. No hay una relación fuerte.");
        System.out.println("La agregación es un tipo de relación que indica que un objeto forma parte o le pertenece a otro objeto. Una clase (la clase contenedora) \ncontiene una referencia a otra clase (la clase contenida) como uno de sus campos. Esta relación indica que la clase contenedora tiene una parte que es otra clase.");
        System.out.println("La composición es una relación como la agregación, pero más fuerte, es decir, un objeto no puede ser ese objeto sin otros objetos.");


    }
}
