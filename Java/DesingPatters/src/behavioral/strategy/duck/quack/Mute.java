package behavioral.strategy.duck.quack;

public class Mute implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Silent! NO NOISE....");
    }
}
