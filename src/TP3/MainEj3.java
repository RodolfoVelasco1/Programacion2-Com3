package TP3;

import java.util.ArrayList;
import java.util.Iterator;

public class MainEj3 {
    public static void main(String[] args) {
        ArrayList<String>days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miercoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sabado");
        days.add("Domingo");

        System.out.println("Días de la semana: " + days);

        days.add(4, "Juernes");

        System.out.println("Se agregó 'Juernes' a la lista.");
        System.out.println("Días en las posiciones 3 y 4: ");
        System.out.println("Días de la semana: " + days.get(3) + " y " + days.get(4));

        System.out.println("Primer elemento de la lista: " + days.get(0));
        System.out.println("Último elemento de la lista: " + days.get(days.size() - 1));

        days.remove("Juernes");
        if (days.contains("juernes")){
            System.out.println("Juernes continúa en la lista.");
        } else {
            System.out.println("Juernes ha sido eliminado de la lista.");
        }

        Iterator<String> iterator = days.iterator();
        System.out.println("Lista de días, a través de un iterador: ");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        boolean found1 = false;
        boolean found2 = false;
        for (String day : days) {
            if (day.equalsIgnoreCase("Lunes")) {
                found1 = true;
            }
            if (day.equalsIgnoreCase("Lunes")){
                found2 = true;
            }
        }

        if(found1 == true){
            System.out.println("Se buscó 'Lunes' y se encontró en la lista.");
        } else {
            System.out.println("No se encontró 'Lunes' en la lista.");
        }

        if(found2 == true){
            System.out.println("Se buscó 'lunes' y se encontró en la lista.");
        } else {
            System.out.println("No se encontró 'lunes' en la lista.");
        }

        days.clear();
        if(days.isEmpty()){
            System.out.println("La lista está vacía.");
        } else {
            System.out.println("Hay elementos en la lista.");
        }



    }
}
