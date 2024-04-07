package Abril04Ej2;

public class Warrior extends baseCharacter {
    private int weaponsNumber;


    public Warrior(String name, int level, int lifePoints, int weaponsNumber) {
        super(name, level, lifePoints);
        this.weaponsNumber = weaponsNumber;
    }

    public int getWeaponsNumber() {
        return weaponsNumber;
    }

    public void setWeaponsNumber(int weaponsNumber) {
        this.weaponsNumber = weaponsNumber;
    }

    @Override
    public int attack(){
        if (this.getLifePoints() > 0){
            int damage = 40 * this.getLevel();
            System.out.println("El Guerrero realizó un ataque de " + damage + " puntos de daño.");
            return damage;
        } else {
            System.out.println("El Guerrero está muerto y no puede atacar.");
            return 0;
        }

    }

    @Override
    public int defend(int damage){
        int life = this.getLifePoints();
        if(life > 0) {
            int defense = 5 * this.getLevel();
            if(damage == 0){
                System.out.println("-------------------------------");
                System.out.println("El guerrero " + this.getName() + " es el ganador.");
                return 0;
            } else if (damage <= defense) {
                System.out.println("El Guerrero realiza defensa de " + defense + " puntos. No recibe daño.");
                System.out.println("-- El Guerrero tiene " + life + " puntos de vida.");
                return life;
            } else {
                damage = damage - defense;
                life = life - damage;
                System.out.println("El Guerrero realiza defensa de " + defense + " puntos. Recibe " + damage + " puntos de daño.");
                this.lifeCheck(life);
                return life;
            }
        } else {
            System.out.println("El Guerrero está muerto y no puede defenderse.");
            return 0;
        }
    }

    @Override
    public void lifeCheck(int life){
        if(life <= 0){
            System.out.println("El Guerrero está muerto.");
        } else {
            System.out.println("-- El Guerrero tiene " + life + " puntos de vida.");
        }

    }

    @Override
    public void print(){
        System.out.println("Tipo: Guerrero");
        super.print();
        System.out.println("Cantidad de armas: " + this.getWeaponsNumber());
    }


}
