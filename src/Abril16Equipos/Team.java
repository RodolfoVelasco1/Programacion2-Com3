package Abril16Equipos;

import java.util.ArrayList;
import java.util.Iterator;

public class Team implements Iterable<Player>{
    private String name;
    private ArrayList<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

    @Override
    public Iterator<Player> iterator() {
        return players.iterator();
    }
}
