package creational.factory.websites;

import creational.factory.websites.pages.CartPage;

/**
 * // Concrete creators override the factory method to change the
 * // resulting product's type.
 */
public class Shop extends Website {
    @Override
    public void createWebSite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
    }
}
