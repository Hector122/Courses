package behavioral.strategy.duck.fly;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Not i can't fly");
    }
}
