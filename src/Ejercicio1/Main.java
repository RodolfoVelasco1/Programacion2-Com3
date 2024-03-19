package Ejercicio1;

import java.util.ArrayList;
import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        Coche auto1 = new Coche("Rojo", 4, 120, 2500);
        Camioneta camion1 = new Camioneta("Azul", 6, 300, 4000, 3000);
        Bicicleta bici1 = new Bicicleta("Violeta", 2, "Urbana");
        Motocicleta moto1 = new Motocicleta("Negro", 2, "Deportiva", 250, 300);

        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(auto1);
        vehiculos.add(camion1);
        vehiculos.add(bici1);
        vehiculos.add(moto1);
        catalogar(vehiculos, 2);
    }

    public static void catalogar(ArrayList<Vehiculo> lista){
        for(int i = 0; i < lista.size(); i++){
            String nombreClase = lista.get(i).getClass().getSimpleName();
            System.out.print("• Vehículo: " + nombreClase + ", ");
            System.out.println(lista.get(i));
        }
    }

    public static void catalogar(ArrayList<Vehiculo> lista, int ruedas){
        int coincidencias = 0;
        for (Vehiculo vehiculo : lista) {
            if (vehiculo.getRuedas() == ruedas) {
                coincidencias = coincidencias + 1;
                String nombreClase = vehiculo.getClass().getSimpleName();
                System.out.print("• Vehículo: " + nombreClase + ", ");
                System.out.println(vehiculo);
            }
        }
        if (coincidencias == 0){
            System.out.println("Ningún vehículo posee " + ruedas + " ruedas.");
        } else {
            System.out.println("Cantidad de vehículos con " + ruedas + " ruedas: " + coincidencias);
        }

    }
}