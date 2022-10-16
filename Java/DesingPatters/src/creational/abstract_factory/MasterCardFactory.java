package creational.abstract_factory;

//Concrete Factory
public class MasterCardFactory extends CreditCardFactory {
    @Override
    public CreditCard getCreditCard(CreditCardType cardType) {
        switch (cardType){
            case PLATINIUM:
                return new MasterCardPlatiniumCreditCard();
            case GOLD:
                return new MasterCardGoldCreditCard();
        }
        return null;
    }
}
