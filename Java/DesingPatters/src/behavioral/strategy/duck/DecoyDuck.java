package behavioral.strategy.duck;

import behavioral.strategy.duck.fly.FlyNoWay;
import behavioral.strategy.duck.quack.Mute;

public class DecoyDuck extends Duck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Mute();
    }

    @Override
    public void display() {
        System.out.println("I am Decoy Duck! ");
    }
}
