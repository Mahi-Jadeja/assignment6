package ducks;

import behaviors.*;

public class RedheadDuck extends Duck {
    public RedheadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
        swimBehavior = new Swim();
    }

    @Override
    public void display() {
        System.out.println("I'm a Redhead Duck!");
    }
}
