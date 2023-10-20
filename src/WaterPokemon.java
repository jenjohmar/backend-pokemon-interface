import java.util.Arrays;
import java.util.List;

public class WaterPokemon extends Pokemon {
    private static final String type = "Water";
    private static final List<String> attacks = Arrays.asList("surf", "hydroPump", "hydroCanon", "rainDance");

    public WaterPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public static List<String> getAttacks() {
        return attacks;
    }

    public void surf(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a surf!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 10 health point!");
                enemy.setHp(enemy.getHp() - 10);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void hydroPump(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a hydro pump!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 10 health point!");
                enemy.setHp(enemy.getHp() - 10);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void hydroCanon(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a hydro canon!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 10 health point!");
                enemy.setHp(enemy.getHp() - 10);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void rainDance(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a rain dance!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " gets a health boost of 10 points!");
                enemy.setHp(enemy.getHp() + 10);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println("has no effect on " + enemy.getName());
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

}
