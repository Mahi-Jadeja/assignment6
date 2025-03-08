package ducks;

import behaviors.*;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    SwimBehavior swimBehavior;

    public Duck() {}

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void performSwim() {
        swimBehavior.swim();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void setSwimBehavior(SwimBehavior sb) {
        swimBehavior = sb;
    }

    public abstract void display();
}
