package behavioral.strategy.duck.quack;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Make squeak noise!   ");
    }
}
