// Name: Mahi Jadeja
// PRN: 23070122074
// Batch: 2023
// Strategy Pattern implementation for Ducks

package ducks;

public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        Duck redhead = new RedheadDuck();
        Duck rubber = new RubberDuck();
        Duck decoy = new DecoyDuck();

        System.out.println("\n--- Mallard Duck ---");
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        mallard.performSwim();

        System.out.println("\n--- Redhead Duck ---");
        redhead.display();
        redhead.performFly();
        redhead.performQuack();
        redhead.performSwim();

        System.out.println("\n--- Rubber Duck ---");
        rubber.display();
        rubber.performFly();
        rubber.performQuack();
        rubber.performSwim();

        System.out.println("\n--- Decoy Duck ---");
        decoy.display();
        decoy.performFly();
        decoy.performQuack();
        decoy.performSwim();
    }
}
