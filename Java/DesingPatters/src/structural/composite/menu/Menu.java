package structural.composite.menu;

import java.util.Iterator;

public class Menu extends MenuComponent {

    public Menu(String name, String url){
        this.name  = name;
        this.url = url;
    }

    @Override
    public String toString() {
        StringBuilder builder =  new StringBuilder();
        builder.append(print(this));

       Iterator<MenuComponent> iterator = menuComponents.iterator();
        while (iterator.hasNext()){
            MenuComponent menuComponent = iterator.next();
            builder.append(menuComponent.toString());
        }

        return  builder.toString();
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent){
        menuComponents.add(menuComponent);
        return menuComponent;
    }

    @Override
    public MenuComponent delete(MenuComponent menuComponent){
        menuComponents.remove(menuComponent);
        return menuComponent;
    }
}
