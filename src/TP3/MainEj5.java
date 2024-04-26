package TP3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainEj5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskList t1 = new TaskList();
        int answer1 = 0;
        System.out.println("---------------------------------");
        System.out.println("Bienvenido a tu organizador de tareas.");
        while (true){
            System.out.println("---------------------------------");
            System.out.println("¿Qué deseas hacer?");
            System.out.println("1. Agregar tarea.");
            System.out.println("2. Mostrar las tareas de la lista.");
            System.out.println("3. Eliminar una tarea de la lista.");
            System.out.println("4. Salir del programa.");
            System.out.print("Ingresa el número de la opción deseada: ");
            try{
                answer1 = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException e){
                System.out.println("Error. Excepción atrapada: " + e.getMessage());
                sc.nextLine();
            }


            if(answer1 == 1){
                System.out.print("Ingrese la descripción de la tarea: ");
                String description = sc.nextLine();
                System.out.print("Ingrese el número de prioridad de la tarea: ");
                int priority = sc.nextInt();
                sc.nextLine();
                t1.addTask(description, priority);

            } else if (answer1 == 2){
                t1.taskNumber();
                if (t1.isEmpty()){
                    System.out.println("La lista está vacía");
                } else {
                    System.out.println("Las tareas de la lista en orden de prioridad descendente: ");
                    for (Task task : t1){
                        System.out.println("Tarea: " + task.getDescription() + ". Prioridad: " + task.getPriority());
                    }
                }

            } else if (answer1 == 3){
                System.out.print("Ingrese la descripción de la tarea a borrar: ");
                String delete = sc.nextLine();
                boolean found = false;
                for (Task task : t1){
                    if (task.getDescription().equals(delete)){
                        found = true;
                        t1.removeTask(task);
                        break;
                    }
                }
                if (found == false){
                    System.out.println("La tarea ingresada no está en la lista.");
                }

            } else if (answer1 == 4){
                System.out.println("Estás saliendo del programa...");
                System.out.println("¡Gracias por usar el programa! ¡Adiós!");
                break;

            } else {
                System.out.println("El número ingresado es incorrecto. Intente de nuevo.");
            }
        }

    }
}
