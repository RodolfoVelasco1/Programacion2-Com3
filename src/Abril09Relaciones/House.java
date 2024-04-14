package Abril09Relaciones;

public class House {
    private int doorNumber;
    private int position = 0;
    private Door[] doors;

    public House(int doorNumber) {
        this.doorNumber = doorNumber;
        this.doors = new Door[doorNumber];
    }

    public int getDoorNumber() {
        return doorNumber;
    }

    public void setDoorNumber(int doorNumber) {
        this.doorNumber = doorNumber;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Door[] getDoors() {
        return doors;
    }

    public void setDoors(Door[] doors) {
        this.doors = doors;
    }

    public void addDoor(String material){
        doors[position] = new Door(material);
        position++;
    }

    public void showDoor(){
        System.out.println("La casa tiene " + this.getDoorNumber() + " puertas.");
        for (int i = 0; i < this.doorNumber; i++){
            System.out.println("La puerta número " + (i+1) + " es de " + this.doors[i].getMaterial());
        }
    }
}
