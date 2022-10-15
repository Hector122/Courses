package creational.abstract_factory;

public class AbstractFactoryDemo {
    public static void main(String[] args){
        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(770);
        CreditCard creditCard = abstractFactory.getCreditCard(CreditCardType.GOLD);

        System.out.println(creditCard.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(610);
        CreditCard creditCard2 = abstractFactory.getCreditCard(CreditCardType.PLATINIUM);

        System.out.println(creditCard2.getClass());
    }
}
