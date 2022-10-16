package structural.adapter.duck;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Turkey is Gobbling");
    }

    @Override
    public void fly() {
        System.out.println("Turkey is fly");
    }
}
