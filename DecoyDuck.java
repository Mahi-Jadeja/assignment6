package ducks;

import behaviors.Floating; // Explicitly import the correct Float class

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        flyBehavior = new behaviors.FlyNoWay(); // Explicitly reference behaviors package
        quackBehavior = new behaviors.MuteQuack();
        swimBehavior = new Floating(); // Use imported behaviors.Float
    }

    @Override
    public void display() {
        System.out.println("I'm a Decoy Duck!");
    }
}
