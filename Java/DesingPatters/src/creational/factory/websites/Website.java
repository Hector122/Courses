package creational.factory.websites;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class, all subclasses should inset the page for their web sites.
 *  The creator class declares the factory method that must
 * return an object of a product class. The creator's subclasses
 * usually provide the implementation of this method.
 */
public abstract class Website {
    protected List<Page> pages = new ArrayList<>();
    /**
     * Constructors call create abstract method
     */
    public Website() {
        this.createWebSite();
    }
    /**
     *  The creator may also provide some default implementation
     *   of the factory method.
     */
    public abstract void createWebSite();

    public List<Page> getWebPageList() {
        return pages;
    }

    public void setWebPageList(List<Page> webPageList) {
        this.pages = webPageList;
    }

}
