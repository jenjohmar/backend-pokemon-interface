import java.util.Arrays;
import java.util.List;

public class FirePokemon extends Pokemon {

    private static final String type = "Fire";
    private static final List<String> attacks = Arrays.asList("fireLash", "flameThrower", "pyroBall", "inferno");

    public FirePokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public static List<String> getAttacks() {
        return attacks;
    }

    public void fireLash(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a fire lash!");
        switch(enemy.getType()){
            case "Fire": {
                System.out.println(enemy.getName() + " loses 1 health points!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Grass": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

        }
    }
    public void flameThrower(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a flame thrower!");
        switch(enemy.getType()){
            case "Fire": {
                System.out.println(enemy.getName() + " loses 1 health points!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Grass": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

        }
    }

    public void pyroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a pyro ball!");
        switch(enemy.getType()){
            case "Fire": {
                System.out.println(enemy.getName() + " loses 1 health points!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Grass": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

        }
    }

    public void inferno(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with an inferno!");
        switch(enemy.getType()){
            case "Fire": {
                System.out.println(enemy.getName() + " loses 1 health points!");
                enemy.setHp(enemy.getHp() - 1);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Grass": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");

        }
    }




}
