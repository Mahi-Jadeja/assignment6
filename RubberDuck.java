package ducks;

import behaviors.*;

public class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squeak();
        swimBehavior = new Floating();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck!");
    }
}
