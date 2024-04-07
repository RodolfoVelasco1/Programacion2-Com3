package Abril04Ej2;

public class Rogue extends baseCharacter {
    private int stealthPercentage;


    public Rogue(String name, int level, int lifePoints, int stealthPercentage) {
        super(name, level, lifePoints);
        this.stealthPercentage = stealthPercentage;
    }

    public int getStealthPercentage() {
        return stealthPercentage;
    }

    public void setStealthPercentage(int stealthPercentage) {
        this.stealthPercentage = stealthPercentage;
    }

    @Override
    public int attack(){
        if (this.getLifePoints() > 0){
            int damage = 35 * this.getLevel();
            System.out.println("El Pícaro realizó un ataque de " + damage + " puntos de daño.");
            return damage;
        } else {
            System.out.println("El Pícaro está muerto y no puede atacar.");
            return 0;
        }

    }

    @Override
    public int defend(int damage){
        int life = this.getLifePoints();
        if(life > 0) {
            int defense = 8 * this.getLevel();
            if(damage == 0){
                System.out.println("-------------------------------");
                System.out.println("El Pícaro " + this.getName() + " es el ganador.");
                return 0;
            } else if (damage <= defense) {
                System.out.println("El Pícaro realiza defensa de " + defense + " puntos. No recibe daño.");
                System.out.println("-- El Pícaro tiene " + life + " puntos de vida.");
                return life;
            } else {
                damage = damage - defense;
                life = life - damage;
                System.out.println("El Pícaro realiza defensa de " + defense + " puntos. Recibe " + damage + " puntos de daño.");
                this.lifeCheck(life);
                return life;
            }
        } else {
            System.out.println("El Pícaro está muerto y no puede defenderse.");
            return 0;
        }
    }

    @Override
    public void lifeCheck(int life){
        if(life <= 0){
            System.out.println("El Pícaro está muerto.");
        } else {
            System.out.println("-- El Pícaro tiene " + life + " puntos de vida.");
        }

    }

    @Override
    public void print(){
        System.out.println("Tipo: Pícaro");
        super.print();
        System.out.println("Porcentaje de sigilo: " + this.getStealthPercentage() + "%");
    }
}
