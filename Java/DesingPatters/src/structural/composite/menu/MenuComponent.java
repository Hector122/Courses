package structural.composite.menu;

import java.util.ArrayList;
import java.util.List;

public abstract class MenuComponent {
    protected String url, name;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public String getUrl() {
        return url;
    }

    public String getName() {
        return name;
    }

    public abstract String toString();

    String print(MenuComponent menuComponent) {
        return name + ": " + url + "\n";
    }

    public MenuComponent add (MenuComponent menuComponent){
        throw  new UnsupportedOperationException("Feature no implemented a this level");
    }
    public MenuComponent delete (MenuComponent menuComponent){
        throw  new UnsupportedOperationException("Feature no implemented a this level");
    }
}
