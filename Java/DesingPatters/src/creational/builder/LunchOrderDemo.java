package creational.builder;

public class LunchOrderDemo {

    public static void main(String args[]){
        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("Wheat")
                .condiments("Lettuce")
                .dressing("Mayo")
                .meat("Turkey");

        LunchOrder lunchOrder = builder.build();
        System.out.println(lunchOrder.getBread() + "\n" +
                lunchOrder.getCondiments() + "\n" +
                lunchOrder.getMeat() + "\n" +
                lunchOrder.getDressing() + "\n");

    }
}
