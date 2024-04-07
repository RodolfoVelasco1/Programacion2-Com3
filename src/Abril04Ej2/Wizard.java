package Abril04Ej2;

public class Wizard extends baseCharacter {
    private int spellsNumber;


    public Wizard(String name, int level, int lifePoints, int spellsNumber) {
        super(name, level, lifePoints);
        this.spellsNumber = spellsNumber;
    }

    public int getSpellsNumber() {
        return spellsNumber;
    }

    public void setSpellsNumber(int spellsNumber) {
        this.spellsNumber = spellsNumber;
    }

    @Override
    public int attack(){
        if (this.getLifePoints() > 0){
            int damage = 30 * this.getLevel();
            System.out.println("El Hechicero realizó un ataque de " + damage + " puntos de daño.");
            return damage;
        } else {
            System.out.println("El Hechicero está muerto y no puede atacar.");
            return 0;
        }

    }

    @Override
    public int defend(int damage){
        int life = this.getLifePoints();
        if(life > 0) {
            int defense = 10 * this.getLevel();
            if(damage == 0){
                System.out.println("El guerrero es el ganador.");
                return 0;
            } else if (damage <= defense) {
                System.out.println("El Hechicero realiza defensa de " + defense + " puntos. No recibe daño.");
                System.out.println("-- El Hechicero tiene " + life + " puntos de vida.");
                return life;
            } else {
                damage = damage - defense;
                life = life - damage;
                System.out.println("El Hechicero realiza defensa de " + defense + " puntos. Recibe " + damage + " puntos de daño.");
                this.lifeCheck(life);
                return life;
            }
        } else {
            System.out.println("El Hechicero está muerto y no puede defenderse.");
            return 0;
        }
    }

    @Override
    public void lifeCheck(int life){
        if(life <= 0){
            System.out.println("El Hechicero está muerto.");
        } else {
            System.out.println("-- El Hechicero tiene " + life + " puntos de vida.");
        }

    }

    @Override
    public void print(){
        System.out.println("Tipo: Hechicero");
        super.print();
        System.out.println("Cantidad de hechizos: " + this.getSpellsNumber());
    }
}
