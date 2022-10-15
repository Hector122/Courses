package creational.prototype;

import com.sun.corba.se.spi.ior.IORTemplate;
import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.HashMap;
import java.util.Map;

public class Registry {
    private Map<ItemType, Item> items = new HashMap<>();

    public Registry(){
        loadItems();
    }

    public Item createItem (ItemType type) {
        Item item = null;

        try {
           item = (Item) items.get(type).clone();
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }

        return  item;
    }


    private void loadItems(){
        Movie movie = new Movie();
        movie.setTitle("Basic Movie");
        movie.setPrice(24.99);
        movie.setRuntime("1:58 hours");
        items.put(ItemType.MOVIE, movie);

        Book book = new Book();
        book.setTitle("Basic book");
        book.setPrice(17.95);
        book.setNumberOfPages(335);
        items.put(ItemType.BOOK, movie);
    }
}
