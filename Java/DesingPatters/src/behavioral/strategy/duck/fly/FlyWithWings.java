package behavioral.strategy.duck.fly;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Yes I fly!!");
    }
}
