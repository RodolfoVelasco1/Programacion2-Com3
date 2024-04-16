package Abril16Equipos;

public class Main {
    public static void main (String[] args){
        Player p1 = new Player("Lionel Messi", "Delantero", 10);
        Player p2 = new Player("Cristian Gabriel Romero", "Defensa", 13);
        Player p3 = new Player("Dibu Martínez", "Arquero", 23);
        Player p4 = new Player("Rodrigo De Paul", "Centrocampista", 7);
        Team t1 = new Team("La Selección Argentina");
        t1.addPlayer(p1);
        t1.addPlayer(p2);
        t1.addPlayer(p3);
        t1.addPlayer(p4);
        System.out.println(t1.getName() + " tiene los siguientes jugadores: ");
        for (Player player : t1){
            System.out.println("Nombre: " + player.getName() + ". Posición: " + player.getPosition() + ". Número de camiseta: " + player.getNumber());
        }


    }
}
