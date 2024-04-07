package Abril04Ej2;

public class Main {
    public static void main(String[] args){
        Warrior wa1 = new Warrior("Hercules", 2, 200, 2);
        Wizard wi1 = new Wizard("Geralt de Rivia", 2, 200, 8);
        Rogue r1 = new Rogue("Rocket", 1, 100, 70);
        Warrior wa2 = new Warrior("Groot", 1, 100, 1);

        System.out.println("----- Primer enfrentamiento: Guerrero VS Hechicero -----");
        System.out.println("--- Información Del Primer Contrincante ---");
        wa1.print();
        System.out.println("--- Información Del Segundo Contrincante ---");
        wi1.print();
        System.out.println("-------------------------------");
        System.out.println("----- ¡Comienza la pelea! -----");

        int warriorDamage;
        int wizardDamage;

        while(wa1.getLifePoints() > 0 & wi1.getLifePoints() > 0){
            warriorDamage = wa1.attack();
            wi1.setLifePoints(wi1.defend(warriorDamage));
            wizardDamage = wi1.attack();
            wa1.setLifePoints(wa1.defend(wizardDamage));
        }
        if(wa1.getLifePoints() > 0){
            System.out.println("-- Ganador: El Guerrero " + wa1.getName()+ " --");
        } else {
            System.out.println("-- Ganador: El Hechicero " + wi1.getName()+ " --");
        }
        System.out.println("-------------------------------");


        System.out.println("----- Segundo enfrentamiento: Guerrero VS Pícaro -----");
        System.out.println("--- Información Del Primer Contrincante ---");
        wa2.print();
        System.out.println("--- Información Del Segundo Contrincante ---");
        r1.print();
        System.out.println("-------------------------------");
        System.out.println("----- ¡Comienza la pelea! -----");

        int rogueDamage;

        while(wa2.getLifePoints() > 0 & r1.getLifePoints() > 0){
            warriorDamage = wa2.attack();
            r1.setLifePoints(r1.defend(warriorDamage));
            rogueDamage = r1.attack();
            wa2.setLifePoints(wa2.defend(rogueDamage));
        }
        if(wa2.getLifePoints() > 0){
            System.out.println("-- Ganador: El Guerrero " + wa2.getName() + " --");
        } else {
            System.out.println("-- Ganador: El Pícaro " + r1.getName() + " --");
        }
        System.out.println("-------------------------------");
    }
}
