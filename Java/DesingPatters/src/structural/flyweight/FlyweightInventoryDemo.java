package structural.flyweight;

public class FlyweightInventoryDemo {

    public static void main(String[] args) {
//        InventorySystem ims = new InventorySystem();
////
////        ims.takeOrders("Roomba", 221);
////        ims.takeOrders("Bose Headphones", 361);
////        ims.takeOrders("Samsung TV", 432);
////        ims.takeOrders("Samsung TV", 323);
////        ims.takeOrders("Roomba", 563);
////        ims.takeOrders("Bose Headphones", 321);
////        ims.takeOrders("Roomba", 234);
////        ims.takeOrders("Samsung TV", 54);
////        ims.takeOrders("Roomba", 34);
////        ims.takeOrders("Bose Headphones", 365);
////
////        ims.process();
////
////        System.out.println(ims.report());

method(null);

    }

    public static void  method(Object o){
        System.out.println("Object Method");
    }
    public static void  method(String o){
        System.out.println("String Method");
        System.out.println('j' + 'a' + 'v' + 'a');
    }

}
