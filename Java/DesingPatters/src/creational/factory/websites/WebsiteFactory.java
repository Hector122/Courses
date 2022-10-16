package creational.factory.websites;

/**
 * picks a creator's type depending on the
 * // current configuration or environment settings.
 **/
public class WebsiteFactory {

    public static Website getWebSite(WebSiteType type) {
        switch (type) {
            case SHOP:
                return new Shop();
            case BLOG:
                return new Blog();
            default:
                return null;
        }
    }
}
