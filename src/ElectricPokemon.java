import java.util.Arrays;
import java.util.List;

public class ElectricPokemon extends Pokemon {
    private static final String type = "Electric";
    private static final List<String> attacks = Arrays.asList("thunderPunch", "electroBall", "voltTackle", "thunder");
    public ElectricPokemon(String name, int level, int hp, String food, String sound) {
        super(name, level, hp, food, sound, type);
    }

    public static List<String> getAttacks() {
        return attacks;
    }

    public void thunderPunch(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with a thunder punch!");

        switch(enemy.getType()) {
            case "Grass":
                {
                    System.out.println(enemy.getName() + " loses 10 health points!");
                    enemy.setHp(enemy.getHp() - 10);
                }
            case "Water": {
                    System.out.println(enemy.getName() + " loses 15 health points!");
                    enemy.setHp(enemy.getHp() - 15);
                }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void electroBall(Pokemon name, Pokemon enemy) {
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with an electro ball!");

        switch(enemy.getType()) {
            case "Grass":
            {
                System.out.println(enemy.getName() + " loses 10 health points!");
                enemy.setHp(enemy.getHp() - 10);
            }
            case "Water": {
                System.out.println(enemy.getName() + " loses 15 health points!");
                enemy.setHp(enemy.getHp() - 15);
            }
            case "Fire": {
                System.out.println(enemy.getName() + " loses 5 health points!");
                enemy.setHp(enemy.getHp() - 5);
            }
            case "Electric": {
                System.out.println(enemy.getName() + " loses 1 health point!");
                enemy.setHp(enemy.getHp() - 1);
            }

            System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
        }
    }

    public void voltTackle(Pokemon name, Pokemon enemy){
            System.out.println(name.getName() + " attacks " + enemy.getName() + " with a volt tackle!");

            switch (enemy.getType()) {
                case "Grass": {
                    System.out.println(enemy.getName() + " loses 10 health points!");
                    enemy.setHp(enemy.getHp() - 10);
                }
                case "Water": {
                    System.out.println(enemy.getName() + " loses 15 health points!");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "Fire": {
                    System.out.println(enemy.getName() + " loses 5 health points!");
                    enemy.setHp(enemy.getHp() - 5);
                }
                case "Electric": {
                    System.out.println(enemy.getName() + " loses 1 health point!");
                    enemy.setHp(enemy.getHp() - 1);
                }

                System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
            }
    }

    public void thunder (Pokemon name, Pokemon enemy){
        System.out.println(name.getName() + " attacks " + enemy.getName() + " with thunder!");
            switch (enemy.getType()) {
                case "Grass": {
                    System.out.println(enemy.getName() + " loses 10 health points!");
                    enemy.setHp(enemy.getHp() - 10);
                }
                case "Water": {
                    System.out.println(enemy.getName() + " loses 15 health points!");
                    enemy.setHp(enemy.getHp() - 15);
                }
                case "Fire": {
                    System.out.println(enemy.getName() + " loses 5 health points!");
                    enemy.setHp(enemy.getHp() - 5);
                }
                case "Electric": {
                    System.out.println(enemy.getName() + " gets a health boost!");
                    enemy.setHp(enemy.getHp() + 10);
                }

                System.out.println(enemy.getName() + " has " + enemy.getHp() + " hp left.");
            }
    }
}