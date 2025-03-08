package behaviors;

public class Swim implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("I'm swimming!");
    }
}
