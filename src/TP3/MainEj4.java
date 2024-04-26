package TP3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainEj4 {
    public static void main(String[] args) {
        ArrayList<Learner>learners = new ArrayList<>();
        Learner l1 = new Learner("Bianca", 8, 9);
        Learner l2 = new Learner("Ruben", 5, 10);
        Learner l3 = new Learner("Santiago", 10, 3);
        Learner l4 = new Learner("Natalia", 12, 7.5);

        learners.add(l1);
        learners.add(l2);
        learners.add(l3);
        learners.add(l4);

        System.out.println("Alumnos en la lista:");
        for(Learner learner : learners){
            System.out.println("Nombre: " + learner.getName() + ". Edad: " + learner.getAge() + ". Nota: " +learner.getAge());
        }

        double averageGrades = 0;
        for(int i = 0; i < learners.size(); i++){
            averageGrades = averageGrades + learners.get(i).getGrade();
        }
        averageGrades = averageGrades / learners.size();
        System.out.println("La media de notas de todos los alumnos: " + averageGrades);

        double bestGrade = 0;
        String bestLearner = " ";

        for (Learner learner : learners){
            if(learner.getGrade() > bestGrade){
                bestGrade = learner.getGrade();
                bestLearner = learner.getName();
            }
        }
        System.out.println("El alumno con la nota más alta es " + bestLearner + " con una nota de " + bestGrade);

        Scanner sc = new Scanner(System.in);
        System.out.print("Para obtener la información de un alumno, ingrese su nombre: ");
        try{
            String name = sc.nextLine();
            boolean found = false;
            for(Learner learner : learners){
                if(learner.getName().equals(name)){
                    found = true;
                    System.out.println("Nombre: " + learner.getName() + ". Edad: " + learner.getAge() + ". Nota: " + learner.getGrade());
                }
            }
            if (found == false) {
                throw new IllegalArgumentException("Ingresó un nombre no válido");
            }
        } catch (Exception e){
            System.out.println("Error. Excepción atrapada: " + e.getMessage());
        }


    }
}
