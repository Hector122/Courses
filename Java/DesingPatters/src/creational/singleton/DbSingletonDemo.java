package creational.singleton;

public class DbSingletonDemo {

    public static void main(String[] args){
        DbSingleton obj1 = DbSingleton.getInstance();
        DbSingleton obj2 = DbSingleton.getInstance();

        boolean value = (obj1 == obj2);
        System.out.println(obj1 +"\n"+ obj2 + "\n" + value );
    }
}
