package creational.factory.websites;

import creational.factory.websites.pages.AboutPage;
import creational.factory.websites.pages.CommentPage;
import creational.factory.websites.pages.ContactPage;
import creational.factory.websites.pages.PostPage;

/**
 * // Concrete creators override the factory method to change the
 * // resulting product's type.
 */
public class Blog extends Website {

    @Override
    public void createWebSite() {
        pages.add(new CommentPage());
        pages.add(new ContactPage());
        pages.add(new PostPage());
        pages.add(new AboutPage());
    }
}
