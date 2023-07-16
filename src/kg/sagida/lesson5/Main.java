package kg.sagida.lesson5;

import kg.sagida.lesson5.templates.Boss;
import kg.sagida.lesson5.templates.Hero;

public class Main {


    public static void main(String[] args) {

        Hero[] myHeroes = createHeroes();
        System.out.println(" HEROES INFORMATION: ");
        for (Hero heroes: myHeroes) {
            System.out.println("HEALTH: " + heroes.getHealth());
            System.out.println("DAMAGE: " + heroes.getDamage());
            System.out.println("SUPER POWER: " + heroes.getSuperPower());
            System.out.println("-------");
        }

        Boss furiousBoss = new Boss();

        furiousBoss.setHealth();
        furiousBoss.setDamage();
        furiousBoss.setProtectionType();

        System.out.println(" BOSS INFORMATION: ");
        System.out.println("HEALTH: " + furiousBoss.getHealth() + " DAMAGE: " + furiousBoss.getDamage() +
                " PROTECTION TYPE: " + furiousBoss.getProtectionType());
    }

    public static Hero[] createHeroes() {

        Hero firstHero = new Hero(70, 20, " Firebending ");

        Hero secondHero = new Hero(90, 15);

        Hero thirdHero = new Hero();

        Hero[] myHeroes = {firstHero, secondHero, thirdHero};

        return myHeroes;
    }
}
