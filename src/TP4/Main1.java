package TP4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int attempt = 0;
        int answer;
        System.out.println("Estoy pensando en un número entre 1 y 100.");
        System.out.println("Intenta adivinarlo.");
        while (true){
            try {
                System.out.println("¿En qué número estoy pensando?");
                System.out.print("Respuesta: ");
                answer = sc.nextInt();
                sc.nextLine();
                if(answer > randomNumber){
                    attempt = attempt + 1;
                    System.out.println("¡Fallaste! Cantidad de intentos: " + attempt);
                    System.out.println("Mi número es menor.");
                } else if (answer < randomNumber) {
                    attempt = attempt + 1;
                    System.out.println("¡Fallaste! Cantidad de intentos: " + attempt);
                    System.out.println("Mi número es mayor.");
                } else {
                    attempt = attempt + 1;
                    System.out.println("¡Ganaste! ¡Adivinaste mi número!");
                    System.out.println("Mi número era " + randomNumber);
                    System.out.println("Cantidad de intentos: " + attempt);
                    break;
                }
            } catch (InputMismatchException e){
                System.out.println("Sólo puedes ingresar números enteros.");
                attempt = attempt + 1;
                System.out.println("¡Fallaste! Cantidad de intentos: " + attempt);
                sc.nextLine();
            }
        }
    }
}
