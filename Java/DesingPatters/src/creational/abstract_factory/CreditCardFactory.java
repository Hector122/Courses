package creational.abstract_factory;

//Abstract factory
public abstract class CreditCardFactory {

    public static CreditCardFactory getCreditCardFactory(int creditScore){
        if(creditScore > 650){
            return new MasterCardFactory();
        } else {
            return new VisaFactory();
        }
    };

    public abstract  CreditCard getCreditCard(CreditCardType cardType);
}
