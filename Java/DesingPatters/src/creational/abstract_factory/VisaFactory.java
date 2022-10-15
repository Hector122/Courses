package creational.abstract_factory;

//Concrete Factory
public class VisaFactory extends CreditCardFactory {

    @Override
    public CreditCard getCreditCard(CreditCardType cardType) {
        switch (cardType) {
            case GOLD:
                return new VisaGoldCreditCard();

            case PLATINIUM:
                return new VisaBlackCreditCard();
        }

        return null;
    }
}
