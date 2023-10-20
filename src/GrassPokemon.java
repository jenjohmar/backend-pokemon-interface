import java.util.Arrays;
import java.util.List;

public class GrassPokemon extends Pokemon {
    private static final String type = "Grass";
    private static final List<String> attacks = Arrays.asList("leafStorm", "solarBeam", "leechSeed", "leaveBlade");

    public GrassPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }
    public static List<String> getAttacks() {
        return attacks;
    }

    public void leafStorm(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a leaf storm!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 15 health point!");
                enemy.setHp(enemy.getHp() - 15);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void solarBeam(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a solar beam!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 15 health point!");
                enemy.setHp(enemy.getHp() - 15);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void leechSeed(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a leech seed!");
        int enemyHpBefore = enemy.getHp();

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
                name.setHp(enemy.getHp() + 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
                name.setHp(enemy.getHp() + 5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
                name.setHp(enemy.getHp() + 10);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 15 health point!");
                enemy.setHp(enemy.getHp() - 15);
                name.setHp(enemy.getHp() + 15);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
            System.out.println(name.getName() + " has gained " + (enemyHpBefore - enemy.getHp()) + " health points!");
        }
    }

    public void leaveBlade(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a leave blade!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 15 health point!");
                enemy.setHp(enemy.getHp() - 15);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }
}
