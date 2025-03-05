abstract class GameCharacter {
    abstract void attack(int attributeValue);
    abstract void defend(int attributeValue);
}

class Warrior extends GameCharacter {
    @Override
    void attack(int strength) {
        int damage = strength * 3;
        System.out.println("Attack: Powerful sword slash for " + damage + " damage!");
    }

    @Override
    void defend(int strength) {
        System.out.println("Defend: Raises shield, defence boosted by " + strength + "!");
    }
}

class Wizard extends GameCharacter {
    @Override
    void attack(int power) {
        int damage = power * 2;
        System.out.println("Attack: Casts spell, deals " + damage + " magical damage!");
    }

    @Override
    void defend(int power) {
        System.out.println("Defend: Creates magical barrier, defence boosted by " + power + "!");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        int attributeValue = scanner.nextInt();
        GameCharacter character;
        if (choice == 1) {
            character = new Warrior();
        } else if (choice == 2) {
            character = new Wizard();
        } else {
            System.out.println("Invalid choice");
            return;
        }

        System.out.println((choice == 1 ? "Warrior" : "Wizard") + " Actions:");
        character.attack(attributeValue);
        character.defend(attributeValue);

        scanner.close();
    }
}

public class q5 {
    
}
