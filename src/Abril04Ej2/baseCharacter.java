package Abril04Ej2;

public abstract class baseCharacter implements Character{
    private String name;
    private int level;
    private int lifePoints;

    public baseCharacter(String name, int level, int lifePoints) {
        this.name = name;
        this.level = level;
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public void print() {
        System.out.println("Nombre: " + this.getName());
        System.out.println("Nivel: " + this.getLevel());
        System.out.println("Puntos de vida: " + this.getLifePoints());
    }
}
