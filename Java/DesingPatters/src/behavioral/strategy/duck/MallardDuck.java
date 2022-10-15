package behavioral.strategy.duck;

import behavioral.strategy.duck.fly.FlyWithWings;
import behavioral.strategy.duck.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck duck");
    }
}
