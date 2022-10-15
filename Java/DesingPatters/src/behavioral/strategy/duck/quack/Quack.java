package behavioral.strategy.duck.quack;

public class Quack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Make Quack noise.");
    }
}
