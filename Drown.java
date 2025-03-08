package behaviors;

public class Drown implements SwimBehavior {
    @Override
    public void swim() {
        System.out.println("I'm drowning! Help!");
    }
}
