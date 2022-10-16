package behavioral.strategy.duck;

import behavioral.strategy.duck.fly.FlyBehavior;
import behavioral.strategy.duck.quack.QuackBehavior;

/**
 * Base class
 */
public abstract class Duck {
    //abstract fly()
    //abstract quack()
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    /**
     * implementent from all duck type
     */
    public abstract void display();

    public void swing() {
        System.out.println("All the duck swing");
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }
}


