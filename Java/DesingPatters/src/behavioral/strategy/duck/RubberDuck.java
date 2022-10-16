package behavioral.strategy.duck;

import behavioral.strategy.duck.fly.FlyBehavior;
import behavioral.strategy.duck.fly.FlyNoWay;
import behavioral.strategy.duck.quack.Mute;
import behavioral.strategy.duck.quack.QuackBehavior;

public class RubberDuck extends Duck {

    public RubberDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = () -> System.out.println("Squeak");
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber duck! and what ???");
    }
}
