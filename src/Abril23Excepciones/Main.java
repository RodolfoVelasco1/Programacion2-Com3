package Abril23Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[2];
        int answer;
        System.out.println("Bienvenido a la calculadora virtual");
        while (true){
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Salir");
            System.out.print("Ingrese el número de operación: ");
            answer = sc.nextInt();

            if(answer == 1){
                numbers = askingNumber(numbers);
                addition(numbers);
            } else if (answer == 2) {
                numbers = askingNumber(numbers);
                subtraction(numbers);
            } else if (answer == 3) {
                numbers = askingNumber(numbers);
                multiplication(numbers);
            } else if (answer == 4) {
                numbers = askingNumber(numbers);
                division(numbers);
            } else if (answer == 5){
                System.out.println("¡Gracias por usar la calculadora!");
                System.out.println("¡Hasta luego!");
                break;
            } else {
                try{
                    throw new MyException("Ingrese un número válido.");
                } catch (MyException e){
                    System.out.println("Ocurrió una excepción: " + e.getMessage());
                }
            }
        }

    }
    public static int [] askingNumber(int[] numbers){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int answer = sc.nextInt();
            numbers[0] = answer;
            System.out.print("Ingrese otro número: ");
            answer = sc.nextInt();
            numbers[1] = answer;
            return numbers;
        } catch (InputMismatchException e) {
            System.out.println("Ocurrió una excepción: Ingrese un número válido");
            System.out.println("Inténtalo nuevamente.");
            askingNumber(numbers);
        }
        return numbers;
    }

    public static void addition(int[] numbers){
        System.out.println(numbers[0] + " + " + numbers[1] + " = " + (numbers[0] + numbers[1]));
    }
    public static void subtraction(int[] numbers){
        System.out.println(numbers[0] + " - " + numbers[1] + " = " + (numbers[0] - numbers[1]));
    }

    public static void multiplication(int[] numbers){
        System.out.println(numbers[0] + " x " + numbers[1] + " = " + (numbers[0] * numbers[1]));
    }

    public static void division(int[] numbers){
        if(numbers[1] == 0){
            try {
                System.out.println(numbers[0] + " % " + numbers[1] + " = " + (numbers[0] / numbers[1]));
            } catch (ArithmeticException e){
                System.out.println("Ocurrio una excepción: " + e.getMessage());
                System.out.println("No se puede dividir un número por cero.");
            }
        } else {
            System.out.println(numbers[0] + " % " + numbers[1] + " = " + (numbers[0] / numbers[1]));
        }

    }
}
