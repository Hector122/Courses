package structural.adapter.duck;


public class MallardDuck implements Duck {

    public void display() {
        System.out.println("I'm a Mallard Duck duck");
    }

    @Override
    public void fly() {
        System.out.println("I'm a MallardDuck, fly");
    }

    @Override
    public void quack() {
        System.out.println("I'm a MallardDuck make quack");
    }
}
