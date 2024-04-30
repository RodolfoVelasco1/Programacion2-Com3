package TP4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double height;
        double area;
        try{
            System.out.print("Ingresa la base del triángulo: ");
            base = sc.nextDouble();
            sc.nextLine();
            System.out.print("Ingresa la altura del triángulo: ");
            height = sc.nextDouble();
            sc.nextLine();
            area = (base * height) / 2;
            System.out.println("El área del triángulo es: " + area);
        } catch (InputMismatchException e){
            System.out.println("Excepción atrapada.");
            System.out.println("Error. Debes ingresar un número.");
        }

    }
}
