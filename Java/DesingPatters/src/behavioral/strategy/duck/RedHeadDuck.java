package behavioral.strategy.duck;

import behavioral.strategy.duck.fly.FlyWithWings;
import behavioral.strategy.duck.quack.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}
