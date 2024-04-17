package Abril16RepasoArreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("-----EJERCICIO 1-----");
        System.out.println(" ");
        ArrayList<Integer> numbers1 = new ArrayList<>();
        int position = 0;
        int biggerNumber = 0;
        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese un número: ");
            int answer = sc.nextInt();
            numbers1.add(answer);
            if(answer > biggerNumber){
                biggerNumber = answer;
                position = i + 1;
            }
        }
        System.out.print("Su lista de 10 números enteros: ");
        for(int number : numbers1){
            System.out.print(number + ", ");
        }
        System.out.println("\nEl número más grande que ingresó es el " + biggerNumber + " y se encuentra en el lugar número " + position);


        System.out.println(" ");
        System.out.println("-----EJERCICIO 2-----");
        System.out.println(" ");

        ArrayList<Integer> numbers2 = new ArrayList<>();
        position = 0;
        biggerNumber = 0;
        boolean primeNumber = false;
        for(int i = 0; i < 10; i++) {
            System.out.print("Ingrese un número: ");
            int answer = sc.nextInt();
            numbers2.add(answer);
            int divisible = 0;
            for(int j = 1; j <= answer; j++){
                if(answer % j == 0){
                    divisible = divisible + 1;
                }
            }
            if(divisible == 2 && answer > biggerNumber){
                biggerNumber = answer;
                position = i + 1;
                primeNumber = true;
            }
        }
        System.out.print("Su lista de 10 números enteros: ");
        for(int number : numbers2){
            System.out.print(number + ", ");
        }
        if(primeNumber){
            System.out.println("\nEl número primo más grande que ingresó es el " + biggerNumber + " y se encuentra en el lugar número " + position);
        } else {
            System.out.println("No ingresó números primos.");
        }


        System.out.println(" ");
        System.out.println("-----EJERCICIO 3-----");
        System.out.println(" ");
        ArrayList<Integer> numbers3 = new ArrayList<>();
        int index = 0;
        for(int i = 100; i < 300; i++){
            int divisible = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    divisible = divisible + 1;
                }
            }
            if(divisible == 2){
                numbers3.add(i);
                index = index + 1;
            }
            if(index == 10){
                break;
            }
        }
        System.out.print("Los 10 primeros números primos comprendidos entre 100 y 300 son: ");
        for (int number : numbers3){
            System.out.print(number + ", ");
        }

        System.out.println(" ");
        System.out.println("-----EJERCICIO 4-----");
        System.out.println(" ");
        ArrayList<Integer> numbers4 = new ArrayList<>();
        ArrayList<Integer> endingFour = new ArrayList<>();
        ArrayList<Integer> positions = new ArrayList<>();
        boolean endsInFour = false;
        for(int i = 0; i < 10; i++){
            System.out.print("Ingrese un número: ");
            int answer = sc.nextInt();
            numbers4.add(answer);
            if(answer % 10 == 4){
                endsInFour = true;
                endingFour.add(answer);
                positions.add(i+1);
            }

        }

        System.out.print("Su lista de números: ");
        for (int number : numbers4){
            System.out.print(number + ", ");
        }

        if(endsInFour){
            System.out.println("\nNúmeros terminados en 4 y su posición: ");
            for(int i = 0; i < endingFour.size(); i++){
                System.out.println("Número: " + endingFour.get(i) + ". Posición: " + positions.get(i) + ".");
            }
        } else {
            System.out.println("No se ingresaron números terminados en 4.");
        }


        System.out.println(" ");
        System.out.println("-----EJERCICIO 5-----");
        System.out.println(" ");
        ArrayList<Integer> numbers5 = new ArrayList<>();
        biggerNumber = 0;
        for (int i = 0; i < 10; i++){
            System.out.print("Ingresa un número: ");
            int answer = sc.nextInt();
            numbers5.add(answer);
            if(answer > biggerNumber){
                biggerNumber = answer;
            }
        }
        System.out.print("Su lista de números: ");
        for (int number : numbers5){
            System.out.print(number + ", ");
        }

        int repetitions = -1;
        int appears = 0;
        for (int number : numbers5){
            if(number == biggerNumber){
                appears = appears + 1;
                repetitions = repetitions + 1;
            }
        }
        System.out.println("\nEl número más grande que ingresó es: " + biggerNumber);
        System.out.println("Cantidad de veces que lo ingresó: " + appears);
        System.out.println("Cantidad de veces que se repite: " + repetitions);




    }
}
