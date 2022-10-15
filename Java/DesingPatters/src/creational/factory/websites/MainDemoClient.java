package creational.factory.websites;


public class MainDemoClient {

    public static void main(String[] args){
        // see pages use for blog
        Website website = WebsiteFactory.getWebSite(WebSiteType.BLOG);
        System.out.println(website.getWebPageList());

        // see pages use for shopping
        website = WebsiteFactory.getWebSite(WebSiteType.SHOP);
        System.out.println(website.getWebPageList());
    }
}
